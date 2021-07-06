import java.util.*;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {

        int[][] arr = new int[rows][columns];
        int[][] arr2 = new int[rows][columns];
        int[] answer = new int[queries.length];
        int index = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = index++;
            }
        }

        for (int index2 = 0; index2 < queries.length; index2++) {
            int x1 = queries[index2][0] - 1;
            int x2 = queries[index2][2] - 1;
            int y1 = queries[index2][1] - 1;
            int y2 = queries[index2][3] - 1;
            int min = arr[x1][y1];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (i == x1 && (j <= y2 && j >= y1 + 1)) {
                        arr2[i][j] = arr[i][j - 1];
                        if (arr2[i][j] <= min)
                            min = arr2[i][j];
                    } else if (i == x2 && (j <= y2 - 1 && j >= y1)) {
                        arr2[i][j] = arr[i][j + 1];
                        if (arr2[i][j] <= min)
                            min = arr2[i][j];
                    } else if (j == y2 && (i >= x1 + 1 && i <= x2)) {
                        arr2[i][j] = arr[i - 1][j];
                        if (arr2[i][j] <= min)
                            min = arr2[i][j];
                    } else if (j == y1 && (i >= x1 && i <= x2 - 1)) {
                        arr2[i][j] = arr[i + 1][j];
                        if (arr2[i][j] <= min)
                            min = arr2[i][j];
                    } else {
                        arr2[i][j] = arr[i][j];
                    }
                }
            }
            answer[index2] = min;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = arr2[i][j];
                }
            }
        }
        return answer;
    }
}
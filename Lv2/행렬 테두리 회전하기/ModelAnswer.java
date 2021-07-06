class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] m = new int[rows][columns];
        int n = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = n++;
            }
        }
        int[] answer = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            answer[i++] = rotation(m, query);
        }
        return answer;
    }

    private int rotation(int[][] m, int[] query) {
        int n = m[query[0] - 1][query[3] - 1];
        int min = n;
        for (int i = query[3] - 1; i >= query[1]; i--) {
            min = Math.min(min, m[query[0] - 1][i - 1]);
            m[query[0] - 1][i] = m[query[0] - 1][i - 1];
        }
        for (int i = query[0]; i < query[2]; i++) {
            min = Math.min(min, m[i][query[1] - 1]);
            m[i - 1][query[1] - 1] = m[i][query[1] - 1];
        }
        for (int i = query[1]; i < query[3]; i++) {
            min = Math.min(min, m[query[2] - 1][i]);
            m[query[2] - 1][i - 1] = m[query[2] - 1][i];
        }
        for (int i = query[2] - 1; i >= query[0]; i--) {
            min = Math.min(min, m[i - 1][query[3] - 1]);
            m[i][query[3] - 1] = m[i - 1][query[3] - 1];
        }
        m[query[0]][query[3] - 1] = n;
        return min;
    }
}
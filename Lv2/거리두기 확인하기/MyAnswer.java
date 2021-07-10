class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        char[][] section = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                section[j] = places[i][j].toCharArray();
            }
            answer[i] = check(section);
        }
        return answer;
    }

    public int check(char[][] arr) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 'P') {
                    for (int k = -2; k <= 2; k++) {
                        for (int l = -2; l <= 2; l++) {
                            if (k == 0 && l == 0)
                                continue;
                            if ((Math.abs(k) + Math.abs(l)) > 2)
                                continue;
                            if ((i + k) < 0 || (i + k) > 4)
                                continue;
                            if ((j + l) < 0 || (j + l) > 4)
                                continue;
                            if ((Math.abs(k) + Math.abs(l)) == 1 && arr[i + k][j + l] == 'P')
                                return 0;
                            if ((Math.abs(k) + Math.abs(l)) == 2 && arr[i + k][j + l] == 'P') {
                                if (k == 0) {
                                    if (arr[i][(j * 2 + l) / 2] == 'O')
                                        return 0;
                                } else if (l == 0) {
                                    if (arr[(i * 2 + k) / 2][j] == 'O')
                                        return 0;
                                } else {
                                    if (!(arr[i][j + l] == 'X' && arr[i + k][j] == 'X'))
                                        return 0;
                                }
                            }

                        }
                    }

                }
            }
        }
        return 1;
    }
}
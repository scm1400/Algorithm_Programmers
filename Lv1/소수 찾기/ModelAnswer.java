class Solution {
	public int solution(int n) {
		int answer = 0;
		boolean flag = true;

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;

				}
			}

			if (flag == true)
				answer++;
			flag = true;
		}
		return answer;
	}
}

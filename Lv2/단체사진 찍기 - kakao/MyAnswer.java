import java.util.*;

class Solution {

	int answer = 0;

	public int solution(int n, String[] data) {

		char[] kakao_friends = new char[] { 'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T' };

		List<Character> arr = new ArrayList<>();
		List<Character> result = new ArrayList<>();

		for (char a : kakao_friends) {
			arr.add(a);
		}

		cases(arr, result, arr.size(), data);

		return answer;
	}

	public void cases(List<Character> arr, List<Character> result, int n, String[] data) {

		if (n == 0) {

			if (check(result, data) == true)
				answer++;

			return;
		}

		for (int i = 0; i < n; i++) {

			result.add(arr.remove(i));
			cases(arr, result, n - 1, data);
			arr.add(i, result.remove(result.size() - 1));
		}
	}

	public boolean check(List<Character> result, String[] data) {

		for (int i = 0; i < data.length; i++) {
			char[] condition = data[i].toCharArray();

			int from = result.indexOf(condition[0]);
			int to = result.indexOf(condition[2]);
			char compare = condition[3];
			int distance = condition[4] - '0';
			int gap = Math.abs(from - to) - 1;

			switch (compare) {
				case '>':
					if (gap <= distance)
						return false;
					break;
				case '=':
					if (gap != distance)
						return false;
					break;
				case '<':
					if (gap >= distance)
						return false;
					break;
			}
		}
		return true;
	}
}
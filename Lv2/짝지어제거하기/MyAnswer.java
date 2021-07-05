import java.util.*;

class Solution {
	public int solution(String s) {
		int answer = 0;
		char[] a = s.toCharArray();
		Stack<Character> Q = new Stack<>();
		char temp = ' ';

		for (char c : a) {
			if (Q.isEmpty()) {
				Q.push(c);
			} else {
				if (c == Q.peek()) {
					Q.pop();
				} else {
					Q.push(c);
				}
			}
		}

		return Q.isEmpty() ? 1 : 0;
	}
}

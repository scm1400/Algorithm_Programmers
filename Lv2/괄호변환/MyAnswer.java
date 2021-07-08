import java.util.Stack;

class Solution {
    int at = 0;

    public String solution(String p) {
        String answer = "";
        if (p.equals(""))
            return p;

        boolean check = check(p);

        String u = p.substring(0, at);
        String v = p.substring(at);

        if (check == true) {
            return u + solution(v);
        }

        answer = "(" + solution(v) + ")";

        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(') {
                answer += ")";
            } else {
                answer += "(";
            }
        }

        return answer;
    }

    public boolean check(String p) {
        boolean bool = true;
        int count_l = 0;
        int count_r = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                count_l++;
                stack.push('(');
            } else {
                count_r++;
                if (stack.isEmpty()) {
                    bool = false;
                } else {
                    stack.pop();
                }
            }

            if (count_r == count_l) {
                at = i + 1;
                return bool;
            }
        }
        return true;
    }
}
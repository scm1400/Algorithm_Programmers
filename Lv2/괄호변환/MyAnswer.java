class Solution {
    public String solution(String p) {
        String answer = "";

        int count_l = 0;
        int count_r = 0;

        String u = "";
        String v = "";
        if (p.equals(""))
            return answer;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == ')') {
                count_r++;
            } else {
                count_l++;
            }
            if (count_r == count_l) {
                u = p.substring(0, i);
                v = p.substring(i);
            }
        }
        System.out.println(u + " : " + v);
        return answer;
    }

    public boolean check(String p) {
        for (int i = 0; i < p.length(); i++) {
            if (!(p.startsWith("(") && p.endsWith(")") && p.length() % 2 == 0)) {
                return false;
            } else {
                check(p.substring(i + 1, p.length()));
            }
        }
    }
}
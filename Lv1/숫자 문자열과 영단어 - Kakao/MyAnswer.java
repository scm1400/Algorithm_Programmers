import java.util.regex.Pattern;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] name = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < name.length; i++) {
            if (s.contains(name[i])) {
                s = s.replaceAll(name[i], "" + i);
            }
        }
        System.out.println(s);
        // answer = Integer.parseInt(s);
        return answer;
    }
}
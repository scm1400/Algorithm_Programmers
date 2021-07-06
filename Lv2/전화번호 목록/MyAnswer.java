
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for (String string : phone_book) {
            for (String string2 : phone_book) {
                if (!string.equals(string2)) {
                    if (string2.startsWith(string) || string.startsWith(string2)) {
                        return false;
                    }
                }
            }
        }

        return answer;
    }
}

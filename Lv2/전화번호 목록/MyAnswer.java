import java.util.HashSet;

class Solution {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < phoneBook.length; i++)
            set.add(phoneBook[i]);
        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 1; j < phoneBook[i].length(); j++) {
                if (set.contains(phoneBook[i].substring(0, j))) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
}

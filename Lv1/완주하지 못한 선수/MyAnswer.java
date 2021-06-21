import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = "";
        int i = 0;

        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }

        return participant[i];

    }
}
import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Calendar cal = Calendar.getInstance();
        
        cal.set(2016, a-1,b);
        
        answer += cal.getTime();
        
        answer = answer.substring(0, answer.indexOf(" "));
        
        return answer.toUpperCase();
    }
}
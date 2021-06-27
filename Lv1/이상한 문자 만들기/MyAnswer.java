class Solution {
    public String solution(String s) {
        String answer = "";
        int temp = 2;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ') temp = 1;
            
            if(temp % 2 ==0)
                answer += Character.toUpperCase(s.charAt(i));
            else
                answer += Character.toLowerCase(s.charAt(i));
            temp ++;
        }
        return answer;
    }
}
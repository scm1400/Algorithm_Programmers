class Solution {
    public String solution(String s) {
        String answer = "";
        int temp = 2;
        for(int i = 0; i < s.length(); i++)
        {
        	char text = s.charAt(i);
            if(text == ' ') temp = 1;
            
            if(temp % 2 ==0)
                answer += Character.toUpperCase(text);
            else
                answer += Character.toLowerCase(text);
            temp ++;
        }
        return answer;
    }
}
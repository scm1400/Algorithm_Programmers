class Solution {
    public String solution(String s) {
        
        String answer = "";
        int len = s.length();
        if (len % 2 == 0) 
        { 
            answer += s.substring((len/2)-1, (len/2)+1); 
        } 
        else 
        { 
            answer += s.charAt(len/2);
        }
        return answer;
    }
}
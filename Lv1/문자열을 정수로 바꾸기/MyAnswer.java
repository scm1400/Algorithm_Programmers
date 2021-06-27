class Solution {
    public int solution(String s) {
        int answer = 0;
        int minus = 1;
        if(s.charAt(0) == '-')
        {
            s = s.substring(1);
            minus = -1;
        }
        else if(s.charAt(0) == '+')
        {
            s = s.substring(1);
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            answer += (s.charAt(i)-48) * Math.pow(10,s.length()-i-1);
        }
        return answer*minus;
    }
}
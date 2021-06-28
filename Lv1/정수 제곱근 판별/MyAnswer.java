class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //System.out.println((long)Math.sqrt(3));
        
        if( Math.pow((long)Math.sqrt(n),2) == n )
        {
        	answer = (long)Math.pow(Math.sqrt(n)+1, 2);
        }
        else answer = -1;
        	
        return answer;
    }
}
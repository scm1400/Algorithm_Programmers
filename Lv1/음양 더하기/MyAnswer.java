class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        int i = 0;
        
        while( i < absolutes.length)
        {
        	if(signs[i] == true)
        	{
        		answer += absolutes[i];
        	}
        	else
        	{
        		answer -= absolutes[i];
        	}
        	i++;
        }
        
        return answer;
        
    }
}
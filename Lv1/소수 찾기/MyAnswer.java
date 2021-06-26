class Solution {
    public int solution(int n) {

        int answer = 0;
    	
    	for(int i =2; i <= n; i++) 
    	{
    		int isPrime = 1;
    		for (int j = 2; j < i; j++) 
    		{
    			if (i % j == 0) 
    			{
    				isPrime = 0;
                    break;
    			}
                continue;
    		}
    		if (isPrime == 1)
            {
                answer++;
            }
    	}
        return answer;
    }
}
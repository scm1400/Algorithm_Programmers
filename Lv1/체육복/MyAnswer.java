class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] a = new int[n];
        for(int i = 0; i < lost.length; i++)
        {
            a[lost[i]-1]--;
        }
        
        for(int i = 0; i < reserve.length; i++)
        {
            a[reserve[i]-1]++;
        }
        
        for(int i = 0 ; i < n ; i++)
        {
        	if(a[i] == -1)
        	{
        		if(i == 0)
        		{
        			if(a[i+1] == 1)
        			{
        				a[i+1]--;
        				a[i]++;
        			}
        		}
        		else if(i == (n-1))
        		{
        			if(a[i-1] == 1)
            		{
            			a[i-1] --;
            			a[i] ++;
            		}
        		}
        		else if(a[i-1] == 1)
        		{
        			a[i-1] --;
        			a[i] ++;
        		}
        		else if(a[i+1] == 1)
        		{
        			a[i+1]--;
        			a[i]++;
        		}
        	}
        }
        
        for(int i = 0 ; i < n ; i++)
        {

        	if(a[i] >= 0)
        	{
        		answer++;
        	}
        }
        
        
        return answer;
    }
}
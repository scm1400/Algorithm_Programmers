import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int seek = priorities[location];
        
        Queue<Integer> Q = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();
        
        
        for(int i = 0; i < priorities.length; i++)
        {
        	Q.offer(priorities[i]);
        	index.offer(i);
        }
        int max = max(Q);
        
        while(index.contains(location))
        {
        	int temp = Q.poll();
        	int temp2 = index.poll();
        	if( temp < max)
        	{
        		Q.add(temp);
        		index.add(temp2);
        	}
        	else if(temp == max)
        	{
        		max = max(Q);
        		answer++;
        	}
        }
        return answer;
    }
    
    public int max(Queue<Integer> a) {
    	int max = 0;
    	for(int i : a)
    	{
    		if(i >= max) max = i; 
    	}
    	return max;
    }
}
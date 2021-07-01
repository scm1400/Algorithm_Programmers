import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i = 0; i < scoville.length; i++)
        {
            list.add(scoville[i]);
        }
        
        while(true)
        {
        	
            if(list.get(0)<K)
            {
                if(list.size()==1)
                {
                	return -1;
                }
            	list.addFirst(list.removeFirst() + list.removeFirst()*2);
            }
            else
            {
            	break;
            }
   
            list.sort(null);
            answer++;
        }
        
        return answer;
    }
    
    
    
}
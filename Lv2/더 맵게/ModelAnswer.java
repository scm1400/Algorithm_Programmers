    import java.util.*;
    class Solution {
        public int solution(int[] scoville, int K) {
           int answer = 0;
           PriorityQueue<Integer> heap = new PriorityQueue<>();
           for(int i = 0; i < scoville.length; i++)
           {
               heap.offer(scoville[i]);
           }
           
           while(true)
           {
        	   if(heap.peek() < K)
        	   {
        		   if(heap.size() == 1) return -1;
        		   
        		   heap.offer(heap.poll() + heap.poll()*2 );
        		   answer++;
        	   }
        	   else
        	   {
        		   break;
        	   }
           }
            
            return answer;
        }
    }

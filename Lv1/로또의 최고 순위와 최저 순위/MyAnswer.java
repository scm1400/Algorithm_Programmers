import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] win = new int[] {6,5,4,3,2,1};
        
        int count_correct = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < lottos.length; i++)
        {
        	map.put(lottos[i], map.getOrDefault(lottos[i], 0) + 1);
        }
        
        for(int i = 0; i < lottos.length; i++)
        {
        	if(map.containsKey(win_nums[i]))
        	{
        		map.put(win_nums[i], map.get(win_nums[i])-1);
        	}
        }
        
        for(Entry<Integer,Integer> entry : map.entrySet())
        {
        	if(entry.getValue() == 0 && entry.getKey() != 0) count_correct++;
        }
        
        if(map.containsKey(0))
        {
        	answer[0] = win[count_correct + map.get(0)-1];
        }
        else
        {
            if(count_correct == 0)
            { 
                answer[0] = 6;
            }
            else
            {
        	    answer[0] = win[count_correct-1];
            }
        }
        
        if(count_correct == 0)
        {
            answer[1] = 6;
        }
        else
        {
            answer[1] = win[count_correct-1];
        }
        
        return answer;
    }
}
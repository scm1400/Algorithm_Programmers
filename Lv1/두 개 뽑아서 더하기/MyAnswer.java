import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++)
        {
        	for(int j = i+1; j < numbers.length; j++)
        	{
        		set.add(numbers[i]+numbers[j]);
        	}
        }
        
        answer = set.stream().mapToInt(i->i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}
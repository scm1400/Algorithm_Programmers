
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % divisor == 0)
            {
                count++;
                list.add(arr[i]);
            }
        }
        
        if(count == 0) list.add(-1);
        
        answer = list.stream().mapToInt(i->i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        TreeSet<Integer> list = new TreeSet<>();
        
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
 
        return list.stream().mapToInt(i->i).toArray();
    }
}
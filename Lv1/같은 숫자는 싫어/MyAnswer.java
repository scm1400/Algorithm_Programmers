import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] != arr[i]) list.add(arr[i-1]);
        }
        list.add(arr[arr.length-1]);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
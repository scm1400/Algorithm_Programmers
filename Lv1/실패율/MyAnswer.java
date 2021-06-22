import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
                        
        int[] failUsers = new int[N+2];
        double userCount = stages.length;
        
        for (int stage : stages) 
        {
            failUsers[stage] += 1;
        }
        
        HashMap<Integer,Double> Arr = new HashMap<>();

        for(int j = 1; j < N+1; j++)
        {
        	double temp = 0.0;
        	if(failUsers[j] != 0)
        	{
        		temp = (failUsers[j] / userCount) * 100;
        		userCount -= failUsers[j];
        	}
        	Arr.put(j, temp);
        }
        
        ArrayList<Integer> KeySetList = new ArrayList<>(Arr.keySet());
        
        Collections.sort(KeySetList, (a1, a2) -> (Arr.get(a2).compareTo(Arr.get(a1))));
        
        return KeySetList.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
               
        ArrayList<Integer> Arr = new ArrayList<>();
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++)
        {
        	for(int j = commands[i][0]; j <= commands[i][1]; j++)
        	{
        		Arr.add(array[j-1]);
        	}
        	Arr.sort(null);
        	answer[i] = Arr.get(commands[i][2]-1);
            Arr.clear();
        }
        return answer;
    }
}
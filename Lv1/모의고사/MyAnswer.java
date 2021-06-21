import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        
        
        int n = answers.length;
        
        int[][] players = new int[][] {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        
        int[] correct = new int[3];
        
        for(int i=0; i<n; i++)
        {
        	for(int j=0; j<3; j++)
        	{
        		if(answers[i]==players[j][i % players[j].length])
        		{
        			correct[j]++;
        		}
        	}
        }
        
        int max = 0;
        for(int i =0; i<3; i++)
        {
        	if(correct[i] > max)
        	{
        		max = correct[i];
        	}
        }
        
        int count = 0;
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i =0; i<3; i++)
        {
        	if(correct[i] == max)
        	{
        		//count++;
        		answer.add(i);
        	}
        }
        
    
//        int[] answer = new int[count];
//        
//        int index = 0;
//        
//        for(int i =0; i<3; i++)
//        {
//        	if(correct[i] == max)
//        	{
//        		answer[index] = i+1;
//                index++;
//        	}
//        }
        
        //Arrays.sort(answer);

        return answer.stream().mapToInt(i->i.intValue()).toArray();
    }
}
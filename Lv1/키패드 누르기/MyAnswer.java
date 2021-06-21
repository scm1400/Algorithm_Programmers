import java.util.ArrayList;

class Solution {
    public String solution(int[] numbers, String hand) {

        
        int l_placeat = 10;
        int r_placeat = 11;
        
        int l_distance = 0;
        int r_distance = 0;
        int num_distance = 0;
        
        ArrayList<String> answer = new ArrayList<String>();
        
        int[][] Arr = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,0,11}};
        
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7)
            {
                l_placeat = numbers[i];
                answer.add("L");
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9)
            {
                r_placeat = numbers[i];
                answer.add("R");
            }
            else
            {
                for(int j = 0; j < 4; j++)
                {
                    for(int k = 0; k < 3; k++)
                    {
                        if(Arr[j][k] == l_placeat)
                        {
                            l_distance = j+k;
                        }
                        
                        if(Arr[j][k] == r_placeat)
                        {
                            r_distance = j+k;
                        }
                        
                        if(Arr[j][k] == numbers[i])
                        {
                            num_distance = j+k;
                        }
                    }
                }
                if(Math.abs(num_distance-l_distance) == Math.abs(num_distance-r_distance))
                {
                	if(hand == "right")
                	{
                		r_placeat = numbers[i];
                		answer.add("R");
                	}
                	else
                	{
                		l_placeat = numbers[i];
                		answer.add("L");
                	}
                }
                else if(Math.abs(num_distance-l_distance) > Math.abs(num_distance-r_distance))
                {
                		l_placeat = numbers[i];
                		answer.add("L");

                }
                else if(Math.abs(num_distance-l_distance) < Math.abs(num_distance-r_distance))
                {
                		r_placeat = numbers[i];
                		answer.add("R");

                }
            }
        }
        
        
        
        return answer.stream().toString();
    }
    
}
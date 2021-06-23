import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int j = 0; j < d.length; j++)
        {
            budget -= d[j];
            if(budget >= 0) answer++;
        }
        
        return answer;
    }
}
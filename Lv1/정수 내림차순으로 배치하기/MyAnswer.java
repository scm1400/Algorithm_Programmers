
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
    	
        int degree = (int)(Math.log10(n)+1);
        Integer[] arr = new Integer[degree];
        
        long answer = 0;
        int index = 0;
        
        while(n>0)
        {
        	arr[index] = (int)(n%10);
        	n /= 10;
        	index++;
        }
        
        Arrays.sort(arr,Comparator.reverseOrder());
        
        for(int i = 0; i < degree; i++)
        {
        	answer = arr[i] + answer * 10;
        }
        

        return answer;
    }
}
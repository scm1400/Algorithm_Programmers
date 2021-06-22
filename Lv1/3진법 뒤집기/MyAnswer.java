import java.util.ArrayList;

class Solution {
    public int solution(int n) {
    
    	int answer = 0;
        ArrayList<Integer> Arr = new ArrayList<>();
        
        while( n > 0 )
        {
        	Arr.add(n % 3);
        	n /= 3;        	
        }
 
        System.out.println(Arr);
        
        for(int j = 0; j< Arr.size(); j++)
        {
        	answer += Arr.get(j) * Math.pow(3, Arr.size()-j-1);
        	
        }
        
        return answer;
        
    }
}
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = 0;
        int a = n>m ? m : n;
        
        for(int i = 1; i <= a; i++)
        {
            if(n % i == 0 && m % i == 0)
            {
                max = i;
            }
        }
        int min = 1;
        for(int i = 1; i<= n*m; i++)
        {
            if( ( a * i) % m == 0 && ( a * i) % n == 0)
            {
                min = i * a;
                break;
            }
        }
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}
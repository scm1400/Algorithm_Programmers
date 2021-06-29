class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for(int i = 0; i < n; i++)
        {
            answer[i] = answer[0] + answer[0]*i;
        }
        
        return answer;
    }
}
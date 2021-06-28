class Solution {
    public int[] solution(long n) {

        int[] answer = new int[(int)(Math.log10(n) + 1)];
        int index = 0;
        while(n > 0)
        {
            answer[index] = (int)(n % 10);
            n = n/10;   
            index++;
        }
        return answer;
    }
}
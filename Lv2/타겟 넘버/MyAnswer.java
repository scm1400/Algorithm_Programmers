class Solution {
    private static int n;
    private static int cnt = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;

        dfs(0, target, numbers);
        answer = cnt;

        return answer;
    }

    public void dfs(int index, int target, int[] numbers) {

        if (index == numbers.length) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            if (sum == target) {
                cnt++;
            }

        } else {

            numbers[index] *= 1;
            dfs(index+1, target, numbers);

            numbers[index] *= -1;
            dfs(index+1, target, numbers);
        }

    }
}
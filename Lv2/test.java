
public class test {
	
    private static int n;
    private static int cnt = 0;
    
	public static void main(String[] args) {
        int answer = 0;
        int[] numbers = new int[] {1,1,1,1,1};
        
        dfs(0, 3, numbers);
        answer = cnt;

        System.out.println(answer);
//        return answer;

	}
	
    public static void dfs(int index, int target, int[] numbers) {

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

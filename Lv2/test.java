import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int[] deposit = new int[] { 500, -500, 300 };

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < deposit.length; i++) {
            if (deposit[i] < 0) {
                int a = deposit[i] * -1;
                while (a > 0) {
                    a -= stack.pop();
                }
                stack.push(Math.abs(a));
            } else {
                stack.push(deposit[i]);
            }
        }
        int[] answer = new int[stack.size()];
        int index = answer.length;
        while (!stack.empty()) {
            answer[index - 1] = stack.pop();
            index--;
        }
        System.err.println(stack);
    }
}

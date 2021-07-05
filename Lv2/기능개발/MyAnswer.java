import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class MyAnswer {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 93, 30, 55 }, new int[] { 1, 30, 5 }));
    }

    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for (int a : progresses) {
            q.add(a);
        }

        int removed_count = 0;

        while (!q.isEmpty()) {
            int deploy_count = 0;

            if (q.peek() >= 100) {
                while (true) {
                    if (!q.isEmpty()) {
                        if (q.peek() >= 100) {
                            q.remove();
                            removed_count++;
                            deploy_count++;
                        } else
                            break;
                    } else
                        break;
                }
                answer.add(deploy_count);
            } else {

                for (int i = removed_count; i < progresses.length; i++) {
                    q.add(q.poll() + speeds[i]);
                }
            }
        }
        return answer;
    }
}

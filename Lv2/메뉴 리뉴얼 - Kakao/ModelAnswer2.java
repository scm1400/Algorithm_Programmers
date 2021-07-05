
import java.util.*;

class Solution {
    public static HashMap<String, Integer> list = new HashMap<>();
    public static boolean[] check;

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        for (int i = 0; i < orders.length; i++) {
            char[] orders_char = orders[i].toCharArray();
            Arrays.sort(orders_char);
            for (int j = 0; j < course.length; j++) {
                check = new boolean[orders[i].length()];
                dfs(orders_char, "", course[j], 0);
            }
        }

        // 여기부터는..

        List<String> keySetList = new ArrayList<>(list.keySet());
        Collections.sort(keySetList, (o1, o2) -> (list.get(o2).compareTo(list.get(o1))));

        List<String> ansList = new ArrayList<>();
        for (int i = 0; i < course.length; i++) {
            int max_value = 0;

            for (String key : keySetList) {
                if (list.get(key) >= 2 && key.length() == course[i]) {
                    if (list.get(key) >= max_value) {
                        ansList.add(key);
                        max_value = list.get(key);
                    }
                }
            }
        }
        Collections.sort(ansList);
        answer = new String[ansList.size()];
        ansList.toArray(answer);

        return answer;
    }

    public static void dfs(char[] arr, String total, int course, int start) {

        if (total.length() == course) {
            list.put(total, list.getOrDefault(total, 0) + 1);
            System.out.println(total);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (!check[i]) {
                check[i] = true;
                dfs(arr, total + arr[i], course, i);
                check[i] = false;
            }
        }
    }

}

import java.util.*;

class MyAnswer {

    static TreeMap<String, Integer> map = new TreeMap<>();
    static TreeSet<String> set = new TreeSet<>();
    static boolean[] visit;

    public static void main(String[] args) {
        String[] a = new String[] { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
        int[] b = new int[] { 2, 3, 4 };
        solution(a, b);
        // System.out.println(map);
        System.out.println(set);
    }

    public static String[] solution(String[] orders, int[] course) {

        for (int j = 0; j < orders.length; j++) {
            char[] charr = orders[j].toCharArray();

            Arrays.sort(charr);
            for (int p = 0; p < course.length; p++) {
                if (course[p] <= orders[j].length()) {
                    visit = new boolean[orders[j].length()];
                    DFS(charr, course[p], 0, "");
                }
            }
        }

        for (int i = 0; i < course.length; i++) {
            int max = 0;
            for (String key : map.keySet()) {
                if (key.length() == course[i] && map.get(key) >= 2) {
                    if (map.get(key) >= max)
                        max = map.get(key);
                }
            }
            for (String key : map.keySet()) {
                if (key.length() == course[i] && map.get(key) >= 2) {
                    if (map.get(key) == max)
                        set.add(key);
                }
            }
        }

        return set.toArray(new String[set.size()]);
    }

    public static void DFS(char[] arr, int course, int index, String sb) {

        if (sb.length() == course) {
            // System.out.println(sb.toString());
            map.put(sb.toString(), map.getOrDefault(sb, 0) + 1);
            return;
        }

        for (int k = index; k < arr.length; k++) {
            if (!visit[k]) {
                visit[k] = true;
                DFS(arr, course, k, sb + arr[k]);
                visit[k] = false;
            }
        }

    }

}

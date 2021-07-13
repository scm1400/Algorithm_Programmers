
import java.util.*;

public class test3 {
    public static void main(String[] args) {

        // 방문 여부를 검사할 배열
        // int[][] wires = new int[][] { { 1, 2 }, { 2, 7 }, { 3, 7 }, { 3, 4 }, { 4, 5
        // }, { 6, 7 } };
        // int[][] wires = new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } };
        int[][] wires = new int[][] { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 4, 6 }, { 4, 7 }, { 7, 8 }, { 7, 9 } };
        int n = wires.length + 1;
        int edges = n - 1;
        boolean visited[] = new boolean[n + 1];

        LinkedList<Integer>[] adjList = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < edges; i++) {
            adjList[wires[i][0]].add(wires[i][1]);
            adjList[wires[i][1]].add(wires[i][0]);
        }

        for (int i = 1; i <= n; i++) { // 방문 순서를 위해 오름차순 정렬
            Collections.sort(adjList[i]);
        }

        int min = n;

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> wires_split = new ArrayList<>();
            visited[i] = true;
            dfs_list(i, adjList, visited, wires_split);
            // System.out.println(wires_split);
            int a = wires_split.size();
            int b = n - wires_split.size();
            min = Math.min(min, Math.abs(a - b));
            visited[i] = false;
        }
        System.out.println(min);
    }

    public static void dfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited, ArrayList<Integer> list) {
        visited[v] = true; // 정점 방문 표시
        // System.out.print(v + ""); // 정점 출력
        list.add(v);
        Iterator<Integer> iter = adjList[v].listIterator(); // 정점 인접리스트 순회
        while (iter.hasNext()) {
            int w = iter.next();
            if (!visited[w]) // 방문하지 않은 정점이라면
            {
                dfs_list(w, adjList, visited, list); // 다시 DFS
            }
        }
    }

}

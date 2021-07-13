import java.util.*;

public class test4 {

    private int v;
    private int e;
    private Map<Integer, HashSet<Integer>> adjMap;
    private static Map<Integer, Integer> visited;

    test4(int vertices) {
        v = vertices;
        adjMap = new HashMap<Integer, HashSet<Integer>>();
        visited = new HashMap<Integer, Integer>();
    }

    private void addEdge(int s, int d) {
        adjMap.putIfAbsent(s, new HashSet<Integer>());
        adjMap.putIfAbsent(d, new HashSet<Integer>());
        adjMap.get(s).add(d);
        adjMap.get(s).add(s);
        adjMap.get(d).add(s);
        adjMap.get(d).add(d);
        visited.put(s, 0);
        visited.put(d, 0);
    }

    private void findDFS(int vertex) {

        visited.put(vertex, 1);

        // System.out.println("vertex " + vertex + " visited");
        for (Integer child : adjMap.get(vertex)) {
            if (visited.get(child) == 0) {
                findDFS(child);
            }
        }
    }

    private void printGraph() {
        for (HashSet<Integer> v : adjMap.values()) {
            System.out.println(v.toString());
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[][] wires = new int[][] { { 1, 2 }, { 2, 7 }, { 3, 7 }, { 3, 4 }, { 4, 5 }, { 6, 7 } };

        int vertices = n;
        int edges = n - 1;

        int ccCount = 0;
        test4 ccc = new test4(vertices);

        for (int i = 0; i < edges; i++) {
            ccc.addEdge(wires[i][0], wires[i][1]);
        }
        ccc.printGraph();

        for (Integer vertex : visited.keySet()) {
            if (visited.get(vertex) == 0) {
                ccc.findDFS(vertex);
                System.out.println("CC Found");
                ccCount++;
            }
        }
        System.out.println("Number of cc component: " + ccCount);

    }
}

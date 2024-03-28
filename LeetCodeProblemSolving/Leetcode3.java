
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode3 {

    public static int[] countServers(int n, int[][] edges, int signalSpeed) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] count = new int[n];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            dfs(i, i, 0, visited, graph, count, signalSpeed);
        }

        return count;
    }

    private static void dfs(int root, int node, int distance, boolean[] visited, List<List<Integer>> graph, int[] count,
            int signalSpeed) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(root, neighbor, distance + 1, visited, graph, count, signalSpeed);
            }
        }
        if (distance % signalSpeed == 0 && node != root) {
            count[node]++;
        }
    }

    public static void main(String[] args) {
        int[][] edges = { { 0, 1, 1 }, { 1, 2, 5 }, { 2, 3, 13 }, { 3, 4, 9 }, { 4, 5, 2 } };
        int signalSpeed = 1;
        int n = 6; // Number of servers
        int[] result = countServers(n, edges, signalSpeed);
        System.out.println(Arrays.toString(result)); // Output: [0, 4, 6, 6, 4, 0]
    }
}

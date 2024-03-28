package AdajacancyMatrix;

import java.util.ArrayList;

public class DFS {

    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        visited[node] = true;
        ans.add(node);

        for (int it : adj.get(node)) {
            if (visited[it] == false) {
            dfs(node, visited, adj, ans);
        }
      }
    }

    public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] visited = new boolean[v + 1];
        int node = 0;
        visited[0] = true;
        dfs(node, visited, adj, arr);
        return arr;
    }
}

package CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * CyclicGraph
 */
public class CyclicGraph {
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[V];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                boolean ans = checkAns(i, visited, adj);

                if (ans == true)
                    return true;
            }
        }
        return false;
    }

    private static boolean checkAns(int src, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        int parent[] = new int[visited.length];
        parent[src] = -1;
        visited[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()) {
            int ele = q.poll();
            for (int neighbour : adj.get(ele)) {
                if (visited[neighbour] == true && neighbour != parent[ele]) {
                    return true;
                } else if (!visited[neighbour]) {
                    q.add(neighbour);
                    parent[neighbour] = ele;
                    visited[neighbour] = true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

    }
}
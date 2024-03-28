package CycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionCodingNinjas {
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Add this line for undirected graph
        }

        boolean visited[] = new boolean[n];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                boolean ans = checkAns(i, visited, adjList);
                if (ans) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    private static boolean checkAns(int src, boolean[] visited, ArrayList<ArrayList<Integer>> adjList) {
        int parent[] = new int[visited.length];
        parent[src] = -1;
        visited[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()) {

            int ele = q.poll();
            for (int neighbour : adjList.get(ele)) {
                if (visited[neighbour] == true && neighbour != parent[ele]) {
                    return true;
                } else if (!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                    parent[neighbour] = ele;
                }
            }

        }
        return false;
    }

}

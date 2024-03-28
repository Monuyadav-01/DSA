import java.util.ArrayList;
import java.util.List;

public class MaximumSum {
    public static int maximumSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        return dfs(0, -1, nums, k, graph, visited); // Starting from the root node (node 0)
    }

    private static int dfs(int node, int parent, int[] nums, int k, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        int sum = nums[node];
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                sum += dfs(neighbor, node, nums, k, graph, visited);
            }
        }
        // Applying the operation (XOR with k) to the node's value
        if (parent != -1) {
            nums[node] ^= k;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 1 };
        int k1 = 3;
        int[][] edges1 = { { 0, 1 }, { 0, 2 } };
        System.out.println("Output for example 1: " + maximumSum(nums1, k1, edges1)); // Output: 6

        int[] nums2 = { 2, 3 };
        int k2 = 7;
        int[][] edges2 = { { 0, 1 } };
        System.out.println("Output for example 2: " + maximumSum(nums2, k2, edges2)); // Output: 9

        int[] nums3 = { 7, 7, 7, 7, 7, 7 };
        int k3 = 3;
        int[][] edges3 = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 0, 4 }, { 0, 5 } };
        System.out.println("Output for example 3: " + maximumSum(nums3, k3, edges3)); // Output: 42
    }
}

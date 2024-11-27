import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpacialArray2 {
  public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int qLen = queries.length;
        boolean[] results = new boolean[qLen];
        
        if (n == 1) {
            // If there's only one element, all queries will be true
            Arrays.fill(results, true);
            return results;
        }

        // Step 1: Preprocess the parity change information
        int[] parityChange = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            parityChange[i] = (nums[i] % 2 == nums[i + 1] % 2) ? 0 : 1;
        }

        // Step 2: Create a prefix sum array from the parity change information
        int[] prefixSum = new int[n - 1];
        prefixSum[0] = parityChange[0];
        for (int i = 1; i < n - 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + parityChange[i];
        }

        // Step 3: Answer each query using the prefix sum array
        for (int i = 0; i < qLen; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            
            if (to - from == 0) {
                // If the subarray has only one element, it's always special
                results[i] = true;
            } else {
                int parityCount = prefixSum[to - 1] - (from > 0 ? prefixSum[from - 1] : 0);
                results[i] = (parityCount == (to - from));
            }
        }
        
        return results;
    }
    public static void main(String[] args) {
        
        
        // Example 1
        int[] nums1 = {3, 4, 1, 2, 6};
        int[][] queries1 = {{0, 4}};
        // boolean[] result1 = sol.isArraySpecial(nums1, queries1);
        // System.out.println(Arrays.toString(result1)); // [false]
        boolean ans[] = isArraySpecial(nums1, queries1);
        for (int i = 0; i < ans.length; i++) {
          System.out.println(ans[i]);
        }

        // Example 2
        int[] nums2 = {4, 3, 1, 6};
        int[][] queries2 = {{0, 2}, {2, 3}};
        // boolean[] result2 = sol.isArraySpecial(nums2, queries2);
         boolean ans2[] = isArraySpecial(nums2, queries2);
        for (int i = 0; i < ans2.length; i++) {
          System.out.println(ans2[i]);
        }
    }
}

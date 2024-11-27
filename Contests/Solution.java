public class Solution {

    public static int countOfPairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] <= nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 3, 2};
        System.out.println(countOfPairs(nums1)); // Expected Output: 4

        // Example 2
        int[] nums2 = {5, 5, 5, 5};
        System.out.println(countOfPairs(nums2)); // Expected Output: 6
    }
}
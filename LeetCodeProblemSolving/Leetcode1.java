import java.util.*;

public class Leetcode1 {

    public static int minOperations(int[] nums, int k) {
        int operations = 0;
        while (true) {
            int minIndex = findMinIndex(nums);
            if (nums[minIndex] >= k) {
                break;
            }
            nums[minIndex] = Integer.MAX_VALUE; // Remove the smallest element
            operations++;
        }
        return operations;
    }

    private static int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 11, 10, 1, 3 };
        int k1 = 10;
        System.out.println("Output for nums1: " + minOperations(nums1, k1)); // Output: 3

        int[] nums2 = { 1, 1, 2, 4, 9 };
        int k2 = 1;
        System.out.println("Output for nums2: " + minOperations(nums2, k2)); // Output: 0

        int[] nums3 = { 1, 1, 2, 4, 9 };
        int k3 = 9;
        System.out.println("Output for nums3: " + minOperations(nums3, k3)); // Output: 4
    }
}

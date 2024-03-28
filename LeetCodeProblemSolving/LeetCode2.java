import java.util.Arrays;
import java.util.PriorityQueue;

import java.util.Arrays;

public class LeetCode2 {
    public static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int operations = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum >= k) {
                right--;
            } else {
                left++;
                nums[left] = nums[left] * 2 + nums[right];
                right--;
                operations++;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1000000000, 999999999, 1000000000, 999999999, 1000000000, 999999999 };
        int k1 = 1000000000;
        System.out.println("Output for nums1: " + minOperations(nums1, k1)); // Output: 2
    }
}

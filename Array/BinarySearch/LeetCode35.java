

/**
 * LeetCode35
 */
public class LeetCode35 {

    public static int searchInsert(int[] nums, int target) {

        // linear search
        // time complexcity = O(n);

        /*
         * int n = nums.length;
         * int ans = n;
         * for (int i = 0; i < n; i++) {
         * if (nums[i] == target) {
         * ans = i;
         * } else if (nums[i] > target) {
         * ans = i;
         * break;
         * }
         * }
         * return ans;
         */

        // binary search because this is sorted array

        int start = 0;
        int n = nums.length;
        int end = n - 1;
        int ans = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }
}
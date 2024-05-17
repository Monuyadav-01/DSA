/**
 * Day29
 */
public class Day29 {
    public static long countSubarrays(int[] nums, int k) {
        long maxElement = Integer.MIN_VALUE;
        for (int i : nums) {
            maxElement = Math.max(i, maxElement);
        }
        long subArrayCnt = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int cnt = 0;
                for (int x = 0; x < j; x++) {
                    if (nums[x] == maxElement) {
                        cnt++;
                    }
                }
                if (cnt >= k) {
                    subArrayCnt++;
                }
            }
        }
        return subArrayCnt;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 2, 1 };
        int k = 3;
        System.out.println(countSubarrays(nums, k));
    }
}
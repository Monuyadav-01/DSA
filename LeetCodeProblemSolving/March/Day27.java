package March;

public class Day27 {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        // test edge cases
        if (k <= 1)
            return 0;

        int cnt = 0;
        int product = 1;
        while (right < n) {
            product = product * nums[right];
            while (product >= k)
                product /= nums[left++];
            cnt += 1 + (right - left);
            right++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int nums[] = { 10, 2, 5, 6 };
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}


/**
 * LeetcodeProblem2040
 */
public class LeetcodeProblem2040 {

    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        long low = Long.MIN_VALUE, high = Long.MAX_VALUE;

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (countPairs(nums1, nums2, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private static long countPairs(int[] nums1, int[] nums2, long target) {
        int count = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int j = n2 - 1;

        for (int i = 0; i < n1; i++) {
            while (j >= 0 && (long) nums1[i] * nums2[j] > target) {
                j--;
            }
            count += (j + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int nums1[] = { -2, -1, 0, 1, 2 };
        int nums2[] = { -3, -1, 2, 4, 5 };
        int k = 3;
        System.out.println(kthSmallestProduct(nums1, nums2, k));
    }

}
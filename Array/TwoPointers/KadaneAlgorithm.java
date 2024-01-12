public class KadaneAlgorithm {

    static long maxSubarraySum(int arr[], int n) {
        long curr_sum = 0;
        long max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum + arr[i];

            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_sum == 0) {
            return -1;
        } else {
            return max_sum;
        }
    }

    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum1(int arr[], int n) {

        // Your code here
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -2, -5 };
        int n = arr.length;
        System.out.println(maxSubarraySum(arr, n));
    }
}

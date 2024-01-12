import java.util.HashSet;

/**
 * ProductPair
 */
public class ProductPair {

    static boolean isProduct(int[] arr, int n, long x) {
        // code here

        // brute force approach

        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = i + 1; j < n; j++) {
         * if (arr[i] * arr[j] == x) {
         * return true;
         * }
         * }
         * }
         * return false;
         * 
         */

        // optimal approach using two pointers
        /*
         * Arrays.sort(arr);
         * int i = 0;
         * int j = n - 1;
         * while (i < j) {
         * 
         * long product = arr[i] * arr[j];
         * if (product == x) {
         * return true;
         * } else if (product < x) {
         * i++;
         * } else {
         * j--;
         * }
         * }
         * return false;
         * 
         */

        HashSet<Long> set = new HashSet<>();
        if (n < 2)
            return false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && x == 0) {
                return true;
            }
            if (arr[i] != 0 && x % arr[i] == 0) {
                if (set.contains(x / arr[i])) {
                    return true;
                } else {
                    set.add(Long.valueOf(arr[i]));
                }

            }

        }
        return false;

    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 9, 40 };
        int N = arr.length, X = 400;
        System.out.println(isProduct(arr, N, X));
    }
}
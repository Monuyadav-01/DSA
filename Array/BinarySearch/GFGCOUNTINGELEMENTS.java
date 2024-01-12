import java.util.ArrayList;
import java.util.Arrays;

public class GFGCOUNTINGELEMENTS {

    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        // add your code here

        /*
         * ArrayList<Integer> ans = new ArrayList<>();
         * for (int i = 0; i < m; i++) {
         * 
         * int count = 0;
         * for (int j = 0; j < n; j++) {
         * if (arr1[i] >= arr2[j]) {
         * count++;
         * }
         * 
         * }
         * ans.add(count);
         * count = 0;
         * }
         * return ans;
         * 
         */

        // optimal approach

        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr2);
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n - 1;
            int cnt = 0;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr1[i] >= arr2[mid]) {
                    cnt = mid + 1;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

            ans.add(cnt);
            cnt = 0;
        }
        return ans;

    }

    public static void main(String[] args) {
        int m = 6, n = 6;
        int arr1[] = { 1, 2, 3, 4, 7, 9 };
        int arr2[] = { 0, 1, 2, 1, 1, 4 };
        System.out.println(countEleLessThanOrEqual(arr1, arr2, m, n));
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * FindEvenLength
 */
public class FindEvenLength {
    public static int findNumbers(int[] nums) {

        // int n = nums.length;
        // List<String> st = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        // st.add("" + nums[i]);
        // }
        // int cnt = 0;
        // for (int i = 0; i < st.size(); i++) {
        // if (st.get(i).length() % 2 == 0) {
        // cnt++;
        // }
        // }
        // return cnt;

        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            while (nums[i] > 0) {
                cnt++;
                nums[i] = nums[i] / 10;
            }
            int d = cnt % 2;
            if (d == 0) {
                ans++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }
}
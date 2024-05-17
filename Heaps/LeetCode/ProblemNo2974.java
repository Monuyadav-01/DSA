import java.util.Arrays;
import java.util.Stack;

/**
 * ProblemNo2974
 */
public class ProblemNo2974 {
    public static int[] numberGame(int nums[]) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int ans[] = new int[n];
        int i = 0;
        int j = 0;
        int k = 2;

        while (i < n) {
            if (st.isEmpty()) {
                while (st.size() != k) {
                    st.push(nums[i]);
                    i++;
                }
            }
            if (st.size() == k) {
                while (!st.isEmpty()) {
                    ans[j] = st.pop();
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 2, 3 };
        int ans[] = numberGame(nums);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
/**
 * SmallestFactMun
 */
public class SmallestFactMun {

    static int findNum(int n) {
        // Complete this function
        int start = 0;
        int end = 5 * n;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int cnt = 0;
            int power = 5;
            while (mid / power != 0) {
                cnt += mid / power;
                power *= 5;
            }
            if (cnt >= n) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(findNum(n));
    }
}
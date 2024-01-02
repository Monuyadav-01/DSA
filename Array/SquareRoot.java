public class SquareRoot {

    // public static int mySqrt(int x) {

    // int ans = 0;

    // for (int i = 1; i <= x; i++) {
    // if (i * i == x) {
    // ans = i;
    // break;
    // }

    // else if (i * i > x) {
    // ans = i - 1;
    // break;
    // }
    // }
    // return ans;

    // }

    public static int mySqrt(int x) {
        int s = 1;
        int e = x;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid == x / mid)
                return mid;
            else if (mid > x / mid) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return e;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
}

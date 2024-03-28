/**
 * ThirdLargest
 */
public class ThirdLargest {

    public static int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for (int num : nums) {
            if (f == num || s == num || t == num) {
                continue;
            }
            if (f <= num) {
                t = s;
                s = f;
                f = num;
            } else if (s <= num) {
                t = s;
                s = num;
            } else if (t <= num) {
                t = num;
            }
        }
        if (t == Long.MIN_VALUE) {
            return (int) f;
        }
        return (int) t;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 10, 15 };
        System.out.println(thirdMax(nums));
    }
}
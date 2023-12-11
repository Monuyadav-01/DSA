import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int x = Integer.MIN_VALUE;
        List<Boolean> ans = new ArrayList<>();
        for (int i : candies) {
            x = Math.max(i, x);
        }

        for (int i : candies) {
            if (extraCandies + i >= x) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int candies[] = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> list = kidsWithCandies(candies, extraCandies);

        System.out.println(
                list);
    }
}

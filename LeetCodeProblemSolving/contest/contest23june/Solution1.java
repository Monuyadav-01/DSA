import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Solution1
 */
public class Solution1 {
  public static double minimumAverage(int[] nums) {
    Arrays.sort(nums);
    int i = 0;
    int n = nums.length - 1;
    ArrayList<Double> list = new ArrayList<>();
    while (i <= n) {
      int min = nums[i];
      int max = nums[n];
      double avg = (min + max) / 2.0;
      list.add(avg);
      i++;
      n--;
    }

    return Collections.min(list);

  }
  public static void main(String[] args) {
    int [] nums = 
        { 7, 8, 3, 4, 15, 13, 4, 1 };

        System.out.println(minimumAverage(nums));

  }
}
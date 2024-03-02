import java.util.ArrayList;

/**
 * ProblemNo1480
 */
public class ProblemNo1480 {
    public static int[] runningSum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int sum = arr.get(i - 1) + nums[i];
            arr.add(sum);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        return nums;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1, 1 };
        int ans[] = runningSum(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
import java.util.ArrayList;

/**
 * CombinationSum
 */
public class CombinationSum {

    static void helper(ArrayList<Integer> given, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int B,
            int sum, int i) {
        if (sum > B) {
            return;
        }
        if (i == given.size()) {
            if (sum == B) {
                ans.add(new ArrayList<>(arr));
            }
            return;
        }

        // include this

        sum += given.get(i);
        arr.add(given.get(i));
        helper(given, arr, ans, B, sum, i);

        // backtrack
        sum -= given.get(i);
        arr.remove(arr.size() - 1);

        // exclude this

        helper(given, arr, ans, B, sum, i + 1);

    }

    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        // add your code herey
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        helper(A, arr, ans, B, 0, 0);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        int B = 16;
        ArrayList<ArrayList<Integer>> ans = combinationSum(arr, B);

        for (ArrayList<Integer> com : ans) {
            System.out.println(com);
        }
    }
}
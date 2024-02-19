import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubSets {

    public static void solve(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr, ArrayList<Integer> A, int i) {

        if (i >= A.size()) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        // exclude
        solve(ans, arr, A, i + 1);

        // include
        int temp = A.get(i);
        arr.add(temp);
        solve(ans, arr, A, i + 1);

        // backtrack
        arr.remove(arr.size() - 1);

    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        // code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        solve(ans, arr, A, i);
        Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                // Compare the first element in each list
                return list1.get(0).compareTo(list2.get(0));
            }
        });
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        ArrayList<ArrayList<Integer>> result = subsets(input);
        System.out.println(result);
    }

}

import java.util.ArrayList;

public class ReveseArrayInKGroup {

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            int temp = 0;

            while (start < end) {
                temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end, temp);
                start++;
                end--;
            }
        }

        for (int i : arr) {
            System.out.println(i + " ");
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        reverseInGroups(arr, arr.size() - 1, 3);
    }
}

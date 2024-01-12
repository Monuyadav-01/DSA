import java.util.ArrayList;
import java.util.HashSet;

public class CommonElemnents {

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here

        ArrayList<Integer> arr = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : A) {
            set.add(i);
        }

        for (int i : B) {
            if (set.contains(i)) {
                set2.add(i);
            }

        }
        for (int i : C) {
            if (set2.contains(i)) {
                arr.add(i);
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int A[] = { 3, 3, 3 };
        int B[] = { 3, 3, 3 };
        int c[] = { 3, 3, 3 };

        int n1 = A.length;
        int n2 = B.length;
        int n3 = c.length;
        System.out.println(commonElements(A, B, c, n1, n2, n3));

    }
}

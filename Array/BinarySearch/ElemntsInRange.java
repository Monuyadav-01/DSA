import java.util.HashSet;

public class ElemntsInRange {

    static boolean check_elements(int arr[], int n, int A, int B) {

        boolean ans = false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        if (set.contains(A) && set.contains(B)) {
            for (int i = A; i <= B; i++) {

                if (set.contains(A + 1)) {
                    ans = true;
                }

            }

        } else {
            ans = false;
        }
        return ans;
    }

    public static void main(String[] args) {
    }
}

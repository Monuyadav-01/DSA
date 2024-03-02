import java.util.ArrayList;
import java.util.List;

public class ProblemNo419 {

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add("" + i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        List<String> ans = fizzBuzz(15);
        for (String i : ans) {
            System.out.print(i + " ");
        }
    }
}

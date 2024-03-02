import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MakeArrayButiful {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        // Stack<Integer> st = new Stack<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        // for (int num : arr) {
        // if (st.isEmpty()) {
        // st.push(num);
        // } else {
        // if ((st.peek() >= 0 && num < 0) || (st.peek() < 0 && num >= 0)) {
        // st.pop();
        // } else {
        // st.push(num);
        // }
        // }
        // }
        // while (!st.isEmpty()) {
        // ans.add(st.pop());
        // }
        // Collections.reverse(ans);
        // return ans;

        // code here
        // Create a stack to store the integers
        Stack<Integer> stack = new Stack<>();

        // Iterate over the input array
        for (int num : arr) {
            // If the stack is empty, push the integer onto the stack
            if (stack.empty()) {
                stack.push(num);
            } else {
                // If the integer has a different sign than the top of the stack, pop the top
                // element
                if ((stack.peek() >= 0 && num < 0) || (stack.peek() < 0 && num >= 0)) {
                    stack.pop();
                } else {
                    // Otherwise, push the integer onto the stack
                    stack.push(num);
                }
            }
        }

        // Create a new ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();

        // Pop the elements from the stack and add them to the result ArrayList
        while (!stack.empty()) {
            result.add(stack.peek());
            stack.pop();
        }

        // Reverse the order of the elements in the result ArrayList
        Collections.reverse(result);

        // Return the result ArrayList
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -7, 1 };
        ArrayList<Integer> ans = makeBeautiful(arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
}

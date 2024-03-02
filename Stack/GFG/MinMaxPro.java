package GFG;

/**
 * MinMaxPro
 */
public class MinMaxPro {

    static int[] maxOfMin(int[] arr, int n) {
        // Your code here

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int min = Integer.MIN_VALUE;
                for (int k = j; k < j + i + 1; k++) {
                    min = Math.max(min, arr[k]);
                }
                ans[i] = Math.min(ans[i], min);
            }
        }
        return ans;

        // int ans[] = new int[n];
        // Stack<Integer> st = new Stack<>();
        // for (int i = 0; i < n; i++) {

        // // next smallest right and next smallest left
        // while (!st.empty() && arr[st.peek()] > arr[i]) {
        // int index = st.peek();
        // st.pop();
        // // i = next smallest right
        // // in stack index would next smallest left

        // if (st.isEmpty()) {
        // int range = i;
        // ans[range - 1] = Math.max(ans[range - 1], arr[index]);
        // } else {
        // int range = i - st.peek() - 1;// max window size
        // ans[range - 1] = Math.max(ans[range - 1], arr[index]);
        // }
        // }
        // st.push(i);
        // }
        // // stack element ko khali karna
        // while (!st.isEmpty()) {
        // int index = st.peek();
        // st.pop();
        // // i = next smallest right
        // // in stack index would next smallest left

        // if (st.isEmpty()) {
        // int range = n;
        // ans[range - 1] = Math.max(ans[range - 1], arr[index]);
        // } else {
        // int range = n - st.peek() - 1;// max window size
        // ans[range - 1] = Math.max(ans[range - 1], arr[index]);
        // }
        // }

        // // ans arr ki value ko update kardo

        // for (int i = n - 2; i >= 0; i--) {
        // ans[i] = Math.max(ans[i], ans[i + 1]);
        // }
        // return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50, 10, 70, 30 };
        int n = arr.length;
        int ans[] = maxOfMin(arr, n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
/**
 * BubbleSort
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap the elements
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 18, 4 };
        int ans[] = sort(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
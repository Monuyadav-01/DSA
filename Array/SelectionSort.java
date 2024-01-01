/**
 * SelectionSort
 */
public class SelectionSort {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 4 };
        int ans[] = sort(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
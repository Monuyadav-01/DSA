/**
 * ClosestNumber
 */
public class ClosestNumber {

    public static int findClosest(int arr[], int n, int target) {
        // Complete the function
        int start = 0;
        int end = n - 1;
        if (target < arr[start])
            return arr[start];

        // if the target > arr[n-1] return arr[n-1]
        if (target > arr[end])
            return arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return arr[mid];
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        if (Math.abs(arr[end] - target) < Math.abs(arr[start] - target))
            return arr[end];
        return arr[start];

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8 };
        int n = arr.length;
        int target = 4;
        System.out.println(findClosest(arr, n, target));
        ;
    }
}
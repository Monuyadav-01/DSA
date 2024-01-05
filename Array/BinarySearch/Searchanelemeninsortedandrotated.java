package BinarySearch;

/**
 * Searchanelemeninsortedandrotated
 */
public class Searchanelemeninsortedandrotated {

    static int Search(int arr[], int target) {
        // code here

        int s = 0;
        int e = arr.length - 1;

        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ans = mid;
            }
            else if(arr[mid])

        }

    }

    public static void main(String[] args) {

    }
}
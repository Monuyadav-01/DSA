

import java.util.ArrayList;

public class FirstAndLast {

    public static int fisrt(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }

    public static int last(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = fisrt(nums, target);
        int last = last(nums, target);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(first);
        arr.add(last);

        int ans[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }

    // public static ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
    // // Code here

    // ArrayList<Integer> res = new ArrayList<>();

    // for (int i = 0; i < n; i++) {
    // if (arr[i] == x) {
    // res.add(i);
    // break;
    // }
    // }
    // for (int j = n - 1; j >= 0; j--) {
    // if (arr[j] == x) {
    // res.add(j);
    // break;
    // }
    // }
    // return res;
    // }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int ans[] = searchRange(nums, 5);
        for (int i : ans) {
            System.out.print(i + "");
        }

    }

}

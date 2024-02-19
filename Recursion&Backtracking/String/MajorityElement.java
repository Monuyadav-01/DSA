package String;

import java.util.*;

public class MajorityElement {

    public static int majority(int nums[]) {
        /*
         * HashMap<Integer, Integer> map = new HashMap<>();
         * int n = arr.length;
         * for (int i : arr) {
         * map.put(i, map.getOrDefault(i, 0) + 1);
         * }
         * 
         * for (int i : map.keySet()) {
         * if (map.get(i) > n / 2) {
         * return i;
         * }
         * }
         * return -1;
         * 
         */

        int ele = 0;
        int cnt = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                ele = nums[i];
                cnt++;
            } else if (ele == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int elementCnt = 0;
        for (int i = 0; i < n; i++) {
            if (ele == nums[i]) {
                elementCnt++;
            }
        }
        if (elementCnt > n / 2) {
            return ele;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majority(arr));
    }
}

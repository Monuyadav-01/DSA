package String;

/**
 * LPS
 */

public class LPS {

    public static int lps(String s) {
        int pre = 0;
        int suff = 1;
        int n = s.length();
        int arr[] = new int[n];
        while (suff < n) {
            if (s.charAt(pre) == s.charAt(suff)) {
                arr[suff] = pre + 1;
                pre++;
                suff++;
            } else {
                if (pre == 0) {
                    arr[suff] = 0;
                    suff++;
                } else {
                    pre = arr[pre - 1];
                }
            }
        }

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(lps(s));
    }
}
public class LeetCode1704 {

    public static boolean halvesAreAlike(String s) {

        int n = s.length();
        int midPoint = n / 2;
        String s1 = s.substring(0, midPoint);
        String s2 = s.substring(midPoint, n);

        return vowelCnt(s1) == vowelCnt(s2);

    }

    public static int vowelCnt(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (checkV(s.charAt(i)) == true) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean checkV(char s) {
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O'
                || s == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "Uo";
        System.out.println(halvesAreAlike(s));
    }
}

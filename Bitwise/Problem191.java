public class Problem191 {

    public static int hammingWeight(int n) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.toString();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
}

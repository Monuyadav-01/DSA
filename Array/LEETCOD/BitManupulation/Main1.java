package BitManupulation;

public class Main1 {

    static void toBinary(int n) {
        // your code here
        // String sb = "";
        // while (n > 0) {
        // if (n % 2 == 0) {
        // sb += "0";
        // } else {
        // sb += "1";
        // }
        // n = n / 2;
        // }

        // String s = "";
        // for (int i = sb.length() - 1; i >= 0; i--) {
        // s += sb.charAt(i);
        // }
        // System.out.println(s);
        // StringBuilder st = new StringBuilder();
        // st.setLength(0);

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            n = n / 2;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int n = 13;
        toBinary(n);
    }
}

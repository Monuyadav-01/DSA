package onpassdp;

public class Tribonacci {

    public static int tri(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int one = tri(n - 1);
        int two = tri(n - 2);
        int three = tri(n - 3);

        return one + two + three;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(tri(n));
    }
}

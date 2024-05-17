package onpassdp;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        
        int fibn = fib(n - 1) + fib(n - 2);
        return fibn;
    }
    public static void main(String[] args) {
        
        int n = 10;
        System.out.println(
            fib(n)
        );
    }
}
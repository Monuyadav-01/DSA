package Recursion.Basics;

public class SumOfNNumbers {


    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = sum(n - 1) + n;
        return sum;
    }
    
    static int Factorial(int n) {
        // Write your code InheritableThreadLocal
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
    
    static int fib(int n) {
        // Write your code here
        if (n == 1 || n == 0) {
            return 0;
        }
        int fibo = fib(n) + fib(n -1);
        return fibo;
    }
    
    public static void main(String[] args) {
        // int n = 90;
        // System.out.println("sum of n numbers" + " " + sum(n));
        // System.out.println("Factorial Numbers" + Factorial(n));
        int n = 7;
        System.out.println(fib(n));

    }
}

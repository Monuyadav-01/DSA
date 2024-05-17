package Recursion.Intro;

public class Intro1 {

    public static void print(int n) {
        if (n == 0)
            return;
        
        
        System.out.println( n  + " " + "days left for birthday");
        print(n - 1);
    }
    public static void main(String[] args) {
        print(4);
    }
}

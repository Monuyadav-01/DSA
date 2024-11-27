import java.util.Scanner;

public class Main {

  public static String binatytodec(int n) {
    String res = "";
    while (n != 1) {
      if (n % 2 == 1)
        res += "1";
      else
        res += "0";

      n /= 2;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String res = binatytodec(n);
    System.out.println(res);

  }
}
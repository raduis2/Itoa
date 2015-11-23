import java.util.*;

public class Itoa {

  public static String itoa(int n, int base) {
    if (n==0) return "0";
    boolean negative = n<0;
    if (negative) n = -n;
    String s = "";
    while (n>0) {
      s = (n % base) + s;
      n = n / base;
    }
    if (negative) s = '-' + s;
    return s;
  }

  public static void main(String[] args) {
    if (args.length < 1) return;
    int n = Integer.parseInt(args[0]);
    System.out.println(itoa(n, 2));
    System.out.println(itoa(n, 10));
  }
}

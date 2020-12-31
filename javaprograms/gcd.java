import java.util.*;

public class gcd {
  public static int gcd(int a, int b){
    return b == 0 ? gcd(b, a%b) : a;
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the numbers a & b");
    int a = s.nextInt();
    int b = s.nextInt();
    int ans = gcd(a,b);
    System.out.println(ans);
  }
}

  

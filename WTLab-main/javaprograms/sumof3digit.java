import java.util.*;
public class sumof3digit {
  public static void main(String args[]) {
    int n;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int ans = 0;
    while(n > 0){
      ans += (n%10); 
      n /= 10;
    }
    System.out.println(ans);
  }
}

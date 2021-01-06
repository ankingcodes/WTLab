import java.util.*;
public class armstrong {
  public static void main(String args[]){
    int n; 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number:");
    n = s.nextInt();
    int _n = n;
    int count = 0;
    int ans = 0;
    while(n > 0){
      int temp = n % 10;
      ans += (temp*temp*temp);
      n = n / 10;
    }
    System.out.println(ans);
    if(ans == _n)
      System.out.println("ARMSTRONG !!");
    else
      System.out.println("NOT ARMSTRONG !!");
  }
}

/* 371 */

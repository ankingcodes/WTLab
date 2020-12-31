import java.util.*;
public class reversedigit {
  public static void main(String args[]) {
    int n; 
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    while(n > 0){
      int temp = n % 10; 
      System.out.print(temp);
      n = n / 10;
    }
  }
}

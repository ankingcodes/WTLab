import java.util.*;
public class multiplicationTable {
  public static void main(String args[]) {
    int n;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int i = 1;
    while(i <= 10){
      System.out.print(n);
      System.out.print("*");
      System.out.print(i);
      System.out.print("=");
      System.out.println(n*i);
      i += 1; 
    }
  }
}

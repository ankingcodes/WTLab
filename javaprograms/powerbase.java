import java.util.*;

public class powerbase {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = s.nextInt();
    System.out.println("Enter base: ");
    int b = s.nextInt();
    int ans = 1;
    while(n > 0){
      ans *= (b);
      n--;
    }
    System.out.print("Power : ");
    System.out.println(ans);
  }
}

  

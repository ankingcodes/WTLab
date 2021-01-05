import java.util.*;

public class fibonacci {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = s.nextInt();
    int x = 0, y = 1;
    while(n>0){
      int z = x + y;
      System.out.print(z);
      System.out.print(',');
      x = y;
      y = z;
      n--;
    }
  }
}

  

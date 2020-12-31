import java.util.*;
public class swapNumberThirdVar {
  public static void main(String args[]){
    double a, b;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the values:");
    a = s.nextInt();
    b = s.nextInt();
    double temp;
    System.out.println("Sorting values...");
    temp = b;
    b = a;
    a = temp;
    System.out.print(a);
    System.out.print(" ");
    System.out.println(b);
  }
}

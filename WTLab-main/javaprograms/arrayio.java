import java.util.*;
public class arrayio {
  public static void main(String args[]){
    int arr[];
    int size;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    size = s.nextInt();
    arr = new int[size];
    System.out.println("Enter elements: ");
    for(int i=0;i<size;i++){
      arr[i] = s.nextInt();
    }
    System.out.println("Displaying elements: ");
    System.out.print("[");
    for(int i=0;i<size;i++){
      System.out.print(arr[i]);
      System.out.print(", ");
    }
    System.out.println("]");
  }
}

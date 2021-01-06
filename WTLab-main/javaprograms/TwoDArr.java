import java.util.*;

public class TwoDArr {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter rows and columns: ");
    int r = s.nextInt();
    int c = s.nextInt();
    int arr[][] = new int[10][10];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++) {
        arr[i][j] = s.nextInt();
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++) {
        System.out.print(arr[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}

  

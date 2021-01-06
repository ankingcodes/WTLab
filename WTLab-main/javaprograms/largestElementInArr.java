import java.util.*;

public class largestElementInArr {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = s.nextInt();
    int arr[];
    arr = new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
      arr[i] = s.nextInt();
    }
    System.out.println("Greatest Integer: ");
    int ans = -1;
    for(int i=0;i<n;i++){
      if(ans < arr[i])
        ans = arr[i];
    }
    System.out.println(ans);
  }
}

  

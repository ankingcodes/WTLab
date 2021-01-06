import java.util.*;
public class factorial {
  public static void main(String args[]){
    int num;
    Scanner s = new Scanner(System.in);
    int ans = 1;
    num = s.nextInt();
    while(num>0){
      ans = ans * num;
      num = num - 1;
    }
    System.out.println(ans);
  }
}

import java.util.*;

public class sumNthTerm {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int ans = 0;
    for(int i=0;i<=n;i++)
      ans += i;
    System.out.println(ans);
  }
}

  

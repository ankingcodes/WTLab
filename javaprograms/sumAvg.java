import java.util.*;

public class sumAvg {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0, avg = 0;
    int i=1; 
    while(i <= n){
      sum += i;
      avg = sum/i;
      i+=1;
    }
    System.out.println(sum);
    System.out.println(avg);
  }
}

  

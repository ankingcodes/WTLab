import java.util.*;

public class dec2Bin {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int bin[] = new int[100];
    int idx = 0;
    while(n > 0){
      bin[idx++] = n % 2;
      n /= 2;
    }
    while(idx >= 0){
      System.out.print(bin[idx]);
      idx--;
    }
  }
}

  

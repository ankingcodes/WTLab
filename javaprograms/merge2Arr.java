import java.util.*;

public class merge2Arr {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int a[] = new int[10];
    int b[] = new int[10];
    int m[] = new int[20];
    for(int i=0;i<n1;i++)
      a[i]=s.nextInt();
    int n2 = s.nextInt();
    for(int i=0;i<n2;i++)
      b[i]=s.nextInt();
    int k=0;
    for(int i=0;i<n1;i++)
      m[k++] = a[i];
    for(int j=0;j<n2;j++)
      m[k++] = b[j];
    for(int i=0;i<k;i++)
      System.out.print(m[i]+" ");
  }
}

  

import java.util.*;

interface pt1 {
  default void show(){
    System.out.println("Default pt1");
  } 
}
interface pt2 {
  default void show(){
    System.out.println("Default pt2");
  } 
}
public class multipleInherit implements pt1, pt2 {
  public static void show(){
    pt1.super.show();
    pt2.super.show();
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    multipleInherit d = new multipleInherit();
    d.show();
  }
}

  

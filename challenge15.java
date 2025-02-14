import java.util.Scanner;

public class challenge15 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number:");
    int number=input.nextInt();
    if(number>0){
      System.out.print("POSITIVE NO.");
    }else{
      if(number<0){
        System.out.print("NEGATIVE NO.");
      }else{
        System.out.println("ZERO");
      }
    }
  }
}

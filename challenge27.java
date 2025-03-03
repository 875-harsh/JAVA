import java.util.Scanner;

public class challenge27 {
  public static void main(String[] args) {
    System.out.println("welcome to odd/even calculator:");
    System.out.print("enter number:");
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    if((num & 1)==1){
      System.out.print("odd number");
    }else{
      System.out.println("even number");
    }


  }
}

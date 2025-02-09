import java.util.Scanner;

public class challenge8 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("swapping:");
    System.out.print("enter a:");
    int a=input.nextInt();
    System.out.print("enter b:");
    int b=input.nextInt();
    int c=a;
    a=b;
    b=c;
    System.out.println("after swapping:");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
  }
}

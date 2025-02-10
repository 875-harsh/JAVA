import java.util.Scanner;

public class challenge9 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter name:");
    String name=input.nextLine();
    System.out.println("name:"+name);
    System.out.print(name +",also tell me your age:");
    int age=input.nextInt();
    System.out.println("age is:"+age);

  }
}

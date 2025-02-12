import java.util.Scanner;

public class challenge11 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter principle:");
    float principle=input.nextFloat();
    System.out.print("enter rate:");
    float rate=input.nextFloat();
    System.out.print("enter time:");
    int time=input.nextInt();
    float CompoundInterest=principle*(1+(rate/100))*time;
    System.out.println("CI:"+CompoundInterest);

  }
}

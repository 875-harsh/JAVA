import java.util.Scanner;

public class challenge28 {
  public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.print("enter number:");
  int n=input.nextInt();
  for(int i=1;i<=10;i++){
    System.out.println(n + "X" +i +"="+ i*n);
  }
  }
}

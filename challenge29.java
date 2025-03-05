import java.util.Scanner;

public class challenge29 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number:");
    int n=input.nextInt();
    int sum=oddSum(n);
    System.out.println("sum:" +sum);
  }

  public static int oddSum(int n) {
    int sum=0;
    int i=1;
    while(i<=n){
      sum+=i;
      i+=2;
    }
    return sum;    
  }
}


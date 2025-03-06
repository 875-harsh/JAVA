import java.util.Scanner;

public class challenge30 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number:");
    int n=input.nextInt();
    long fact=factorial(n);
    System.out.print("factorial:" +fact);
  }
   public static long factorial(int n){
    if(n<2){
      return 1;
    }
    long fact=1;
    int i=2;
    while(i<=n){
      fact*=i;
      i++;
    }

    return fact;

    
   }
}

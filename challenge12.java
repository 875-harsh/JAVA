import java.util.Scanner;

public class challenge12 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter income:");
    int income=input.nextInt();
    if(income<500000){
      System.out.print("tax:"+0);
    }
    else if(income>=500000 && income<1000000){
      System.out.print("tax:"+income*0.2);
    }
    else{
      System.out.print("tax:"+income*0.3);
    }
  }
}

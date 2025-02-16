import java.util.Scanner;

public class challenge17 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter no.1:");
    int n1=input.nextInt();
    System.out.print("enter no.2:");
    int n2=input.nextInt();
    System.out.print("enter no.3:");
    int n3=input.nextInt();
    if((n1>n2)||(n1>n3)){
      System.out.print("N1 IS GREATEST:"+n1);
    }else{
      if((n2>n3)||(n2>n1)){
        System.out.print("N2 IS GREATEST:"+n2);
      }else{
        System.out.print("N3 IS GREATEST:"+n3);
      }

    }
  }
}

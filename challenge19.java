import java.util.Scanner;

public class challenge19 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER GRADE:");
    float grade=input.nextFloat();
    float c=grade%100;
    if(c>90%100){
      System.out.print("GRADE:A");
    }else if(c>75%100){
      System.out.print("GRADE:B");
    }else if(c>60%100){
      System.out.print("GRADE:C");
    }else if(c>30%100){
      System.out.print("GRADE:D");
    }else{
      System.out.println("GRADE:F");
    }
  }
}

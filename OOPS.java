class Pen{
  String colour;
  String type;

  public void write(){
    System.out.println("WRITING SOMETHING");
  }
  public void printColour(){
    System.out.println("COLOUR:"+this.colour);
  }
  public void printType(){
    System.out.println("TYPE:"+this.type);
  }
}

class Student{
  String name;
  int age;
  
  public void printInfo(){
    System.out.println("NAME:"+this.name);
    System.out.println("AGE:"+this.age);
  }
}
public class OOPS{
  public static void main(String[] args) {
    Pen pen1=new Pen();
    pen1.colour="BLUE";
    pen1.type="GEL";
    Pen pen2=new Pen();
    pen2.colour="RED";
    pen2.type="BALLPOINT";

    // pen1.printColour();
    // pen1.printType();
    // pen2.printColour();
    // pen2.printType();
    Student s1=new Student();
    s1.name="John Doe";
    s1.age=20;
    s1.printInfo();
  }
}
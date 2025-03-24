package Hybrid_Inheritance;

public class D implements B, C{

  static public final int a=70;
  public final int b=80;

  public void display1(){
    System.out.println("\nIn Interface A:");
    System.out.println("A.a="+A.a);
    System.out.println("A.b="+A.b);
  }

  public void display2(){
    System.out.println("\nIn Interface B:");
    System.out.println("B.a="+B.a);
    System.out.println("B.b="+B.b);
  }

  public void display3(){
    System.out.println("\nIn Interface C:");
    System.out.println("C.a="+C.a);
    System.out.println("C.b="+C.b);
  }

  public void display4(){
    System.out.println("\nIn Class D:");
    System.out.println("D.a="+D.a);
    System.out.println("D.b="+this.b);
  }

  public static void main(String[] args){
    D ob1 = new D();
    ob1.display1(); 
    ob1.display2();
    ob1.display3(); 
    ob1.display4();
  }
}

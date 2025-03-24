package Multiple_Inheritance;

import java.util.Scanner;

public class C implements A, B{

  public int a, b;

  C(int a, int b){
    this.a = a;
    this.b = b;
  }

  public void display1(){
    System.out.println("In Parent A: ");
    System.out.println("A.a="+A.a);
    System.out.println("A.b="+A.b);
  }

  public void display2(){
    System.out.println("In Parent B: ");
    System.out.println("B.a="+B.a);
    System.out.println("B.b="+B.b);
  }

  public void display3(){
    System.out.println("In Child C: ");
    System.out.println("C.a="+this.a);
    System.out.println("C.b="+this.b);
  }

  public static void main(String[] args){
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor C Object 1: ");
    System.out.println("Enter value for a: ");
    a = sc.nextInt();
    System.out.println("Enter value for b: ");
    b = sc.nextInt();
    C ob1 = new C(a, b);
    ob1.display1();
    ob1.display2();
    ob1.display3();
    sc.close();
  }
}

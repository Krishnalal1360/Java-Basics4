package Hierarchical_Inheritance;

import java.util.Scanner;

public class B extends A{

  public int a;
  protected int b;
  private int c;

  public void methodA(int a, int b, int c){
    System.out.println("In method A: ");
    this.a = a;
    this.b = b;
    this.c = c;
    System.out.println("a="+this.a);
    System.out.println("b="+this.b);
    System.out.println("c="+this.c);
  }

  protected void methodB(int a, int b, int c){
    System.out.println("In method B: ");
    this.a = a;
    this.b = b;
    this.c = c;
    System.out.println("a="+this.a);
    System.out.println("b="+this.b);
    System.out.println("c="+this.c);
  }

  private void methodC(int a, int b, int c){
    System.out.println("In method C: ");
    this.a = a;
    this.b = b;
    this.c = c;
    System.out.println("a="+this.a);
    System.out.println("b="+this.b);
    System.out.println("c="+this.c);
  }

  public static void main(String[] args){
    int a=0, b=0, c=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nIn Class B");
    System.out.println("Enter value for a: ");
    a = sc.nextInt();
    System.out.println("Enter value for b: ");
    b = sc.nextInt();
    System.out.println("Enter value for c: ");
    c = sc.nextInt();
    B ob1 = new B();
    ob1.methodA(a, b, c);
    ob1.methodB(a, b, c);
    ob1.methodC(a, b, c);

    System.out.println("\nIn Class A");
    System.out.println("Enter value for a: ");
    a = sc.nextInt();
    System.out.println("Enter value for b: ");
    b = sc.nextInt();
    System.out.println("Enter value for c: ");
    c = sc.nextInt();
    A ob2 = new A();
    ob2.methodA(a, b, c);
    ob2.methodB(a, b, c);
    //ob2.methodC(a, b, c);
    sc.close();
  }
}

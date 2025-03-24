package Abstract;

import java.util.Scanner;

public class Child extends Parent{

  public boolean m;
  public char g;
  public int a;
  public float h;
  public double w;
  public String n;

  Child(String n, int a, float h, double w, char g, boolean m){
    this.n = n;
    this.a = a;
    this.h = h;
    this.w = w;
    this.g = g;
    this.m = m;
  }

  public void display(){
    System.out.println("\nChild Bio Data: ");
    System.out.println("Name: "+this.n);
    System.out.println("Age: "+this.a);
    System.out.println("Height: "+this.h);
    System.out.println("Weight: "+this.w);
    System.out.println("Gender: "+this.g);
    System.out.println("Marital Status: "+this.m);
  }

  public void display1(String n, int a, float h, double w, char g, boolean m){
    System.out.println(st1);
    System.out.println(Parent.st);
    System.out.println("Name: "+n);
    System.out.println("Age: "+a);
    System.out.println("Height: "+h);
    System.out.println("Weight: "+w);
    System.out.println("Gender: "+g);
    System.out.println("Marital Status: "+m);
  }

  public static void main(String[] args){
    boolean m;
    char g;
    int a;
    float h;
    double w;
    String n;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Child Object 1: ");
    System.out.println("Enter name: ");
    n = sc.nextLine();
    System.out.println("Enter age: ");
    a = sc.nextInt();
    System.out.println("Enter height: ");
    h = sc.nextFloat();
    System.out.println("Enter weight: ");
    w = sc.nextDouble();
    System.out.println("Enter gender: ");
    g = sc.next().charAt(0);
    System.out.println("Enter marital status: ");
    m = sc.nextBoolean();
    Child ob1 = new Child(n, a, h, w, g, m);
    ob1.display();

    System.out.println("\nFor Parent: ");
    System.out.println("Enter name: ");
    sc.nextLine();
    n = sc.nextLine();
    System.out.println("Enter age: ");
    a = sc.nextInt();
    System.out.println("Enter height: ");
    h = sc.nextFloat();
    System.out.println("Enter weight: ");
    w = sc.nextDouble();
    System.out.println("Enter gender: ");
    g = sc.next().charAt(0);
    System.out.println("Enter marital status: ");
    m = sc.nextBoolean();
    ob1.display1(n, a, h, w, g, m);
    sc.close();
  }
}

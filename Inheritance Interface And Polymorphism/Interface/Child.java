package Interface;

import java.util.Scanner;

public class Child implements Parent1, Parent2{

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

  public void display1(){
    //System.out.println("\nDaddy Bio Data: ");
    //System.out.println(n1);
    System.out.println(Parent1.n1);
    System.out.println("Name: "+Parent1.n);
    System.out.println("Age: "+Parent1.a);
    System.out.println("Height: "+Parent1.h);
    System.out.println("Weight: "+Parent1.w);
    System.out.println("Gender: "+Parent1.g);
    System.out.println("Marital Status: "+Parent1.m);
  }

  public void display2(){
    //System.out.println("\nMommy Bio Data: ");
    //System.out.println(n2);
    System.out.println(Parent2.n2);
    System.out.println("Name: "+Parent2.n);
    System.out.println("Age: "+Parent2.a);
    System.out.println("Height: "+Parent2.h);
    System.out.println("Weight: "+Parent2.w);
    System.out.println("Gender: "+Parent2.g);
    System.out.println("Marital Status: "+Parent2.m);
  }

  public static void main(String[] args) {
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
    ob1.display1();
    ob1.display2();
    sc.close();
  }
}

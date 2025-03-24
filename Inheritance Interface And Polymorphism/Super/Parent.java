package Super;

import java.util.Scanner;

public class Parent{

  public boolean m;
  public char g;
  public int a;
  public float h;
  public double w;
  public String n;

  Parent(String n, int a, float h, double w, char g, boolean m){
    this.n = n;
    this.a = a;
    this.h = h;
    this.w = w;
    this.g = g;
    this.m = m;
  }

  public void display(){
    System.out.println("\nParent Bio Data: ");
    System.out.println("Name: "+this.n);
    System.out.println("Age: "+this.a);
    System.out.println("Height: "+this.h);
    System.out.println("Weight: "+this.w);
    System.out.println("Gender: "+this.g);
    System.out.println("Marital Status: "+this.m);
  }

  public static void main(String[] args){
    boolean m;
    char g;
    int a;
    float h;
    double w;
    String n;
    Scanner sc = new Scanner(System.in);
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
    Parent ob1 = new Parent(n, a, h, w, g, m);
    ob1.display();
    sc.close();
  }
}

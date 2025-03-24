package Super;

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
    System.out.println("\nFor Parent Object 1: ");
    String n1;
    int a1;
    float h1;
    double w1;
    char g1;
    boolean m1;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    n1 = sc.nextLine();
    System.out.println("Enter age: ");
    a1 = sc.nextInt();
    System.out.println("Enter height: ");
    h1 = sc.nextFloat();
    System.out.println("Enter weight: ");
    w1 = sc.nextDouble();
    System.out.println("Enter gender: ");
    g1 = sc.next().charAt(0);
    System.out.println("Enter marital status: ");
    m1 = sc.nextBoolean();
    //super("Alex Christ", 30, 5.8f, 50.80d, 'M', true);
    super(n1, a1, h1, w1, g1, m1);
  }

  public void display(){
    super.display();
    System.out.println("\nChild Bio Data: ");
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
    sc.close();
  }
}

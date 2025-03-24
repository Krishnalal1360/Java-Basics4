package Unsolved_Problems;

import java.util.Scanner; 

public class Wages extends Worker{
  
  public int hrs;
  public double rate, wage;

  Wages(int h, double r){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter worker name: ");
    String n = sc.nextLine();
    System.out.println("Enter basic salary: ");
    double b = sc.nextDouble();
    super(n, b);
    this.hrs = h;
    this.rate = r;
  }

  public double overtime(){
    return this.basic+(this.hrs*this.rate);
  }

  public void display(){
    super.display();
    System.out.println("Number of extra hours worked: "+this.hrs);
    System.out.println("Rate per hour: Rs."+this.rate);
    System.out.println("Wage: Rs."+overtime());
  }

  public static void main(String[] args){
    int h=0;
    double r=0.0d;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter number of extra hours worked: ");
    h = sc.nextInt();
    System.out.println("Enter rate per hour: ");
    r = sc.nextDouble();
    Wages ob1 = new Wages(h, r);  
    ob1.display();
    sc.close();
  }
}

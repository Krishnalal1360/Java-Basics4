package Unsolved_Problems;

import java.util.Scanner; 

public class Salary1 extends Employee1{
  
  public double basic, da, hra, pf, ns, ts;

  Salary1(float bp){
    this.basic = bp;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employee name: ");
    String enm = sc.nextLine();
    System.out.println("Enter employee number: ");
    String eno = sc.next();
    System.out.println("Enter employee designation: ");
    sc.nextLine();
    String eds = sc.nextLine();
    super(enm, eno, eds);
  }

  public void calculate(){
    double dap=0.0d, hrap=0.0d, pff=0.0d;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter dearness allowance percentage: ");
    dap = sc.nextDouble();
    System.out.println("Enter house rent allowance percentage: ");
    hrap = sc.nextDouble();
    System.out.println("Enter provident fund percentage: ");
    pff = sc.nextDouble();
    this.da = (dap/100.0)*this.basic;
    this.hra = (hrap/100.0)*this.basic;
    this.ts = this.basic+this.da+this.hra;
    this.pf = (pff/100.0)*this.basic;
    this.ns = this.ts-this.pf;
  }

  public void display(){
    super.display();  
    System.out.println("Basic pay: Rs."+this.basic);
    System.out.println("Dearness allowance: Rs."+this.da);
    System.out.println("House rent allowance: Rs."+this.hra);
    System.out.println("Provident fund: Rs."+this.pf);
    System.out.println("Total salary: Rs."+this.ts);
    System.out.println("Net salary: Rs."+this.ns);
  }

  public static void main(String[] args){
    float b=0.0f;
    System.out.println("\nFor Object 1: ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter basic pay: ");
    b = sc.nextFloat();
    Salary1 ob1 = new Salary1(b);
    ob1.calculate();
    ob1.display();
    sc.close();
  }
}

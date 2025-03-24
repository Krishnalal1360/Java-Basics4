package Unsolved_Problems;

import java.util.Scanner;

public class Salary extends Employee{

  public float da, hra, spl, tsal;

  Salary(float d, float h, float s){
    int e=0;
    double b=0.0d;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employee number: ");
    e = sc.nextInt();
    System.out.println("Enter basic pay: ");
    b = sc.nextDouble();
    super(e, b);
    this.da = d;
    this.hra = h;
    this.spl = s;
  }

  public float calculate_sal(){
    this.tsal = (float)(this.bsal+this.da+this.hra+this.spl);
    return this.tsal;
  }

  public void show_salary(){
    super.salInfo();
    System.out.println("Dearness Allowance: Rs."+this.da);
    System.out.println("House Rent Allowance: Rs."+this.hra);
    System.out.println("Special Allowance: Rs."+this.spl);
    System.out.println("Net Salary: Rs."+this.calculate_sal());
  }

  public static void main(String[] args){
    float d=0.0f, h=0.0f, s=0.0f;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter dearness allowance: ");
    d = sc.nextFloat(); 
    System.out.println("Enter house rent allowance: ");
    h = sc.nextFloat();
    System.out.println("Enter special allowance: ");
    s = sc.nextFloat();
    Salary ob1 = new Salary(d, h, s);
    ob1.show_salary();
    sc.close();
  }
}
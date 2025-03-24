package Unsolved_Problems;

import java.util.Scanner;

public class Employee{

  public int empn;
  public double bsal;

  Employee(int e, double b){
    this.empn = e;
    this.bsal = b;
  }

  public void salInfo(){
    System.out.println("Employee Number: "+this.empn);
    System.out.println("Basic Salary: Rs."+this.bsal);
  }

  public static void main(String[] args){
    int e=0;
    double b=0.0d;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter employee number: ");
    e = sc.nextInt();
    System.out.println("Enter basic pay: ");
    b = sc.nextDouble();
    Employee ob1 = new Employee(e, b);
    ob1.salInfo();
    System.out.println("\nFor Object 2: ");
    System.out.println("Enter employee number: ");
    e = sc.nextInt();
    System.out.println("Enter basic pay: ");
    b = sc.nextDouble();
    Employee ob2 = new Employee(e, b);
    ob2.salInfo();
    sc.close();
  }
}
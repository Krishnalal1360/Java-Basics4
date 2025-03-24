package Unsolved_Problems;

import java.util.Scanner;

public class Worker{
  
  public String name;
  public double basic;

  Worker(String n, double b){
    this.name = n;
    this.basic = b;
  }

  public void display(){
    System.out.println("Name: "+this.name);
    System.out.println("Basic Salary: Rs."+this.basic);
  }

  public static void main(String[] args){
    String n="";
    double b=0.0d;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter worker name: ");
    n = sc.nextLine();
    System.out.println("Enter basic salary: ");
    b = sc.nextDouble();
    Worker ob1 = new Worker(n, b);
    ob1.display();
    sc.close();
  }
}

package Unsolved_Problems;

import java.util.Scanner;

public class Bank{
  
  public String name;
  public long accno;
  public double p;

  Bank(String n, long a, double p){
    this.name = n;
    this.accno = a;
    this.p = p;
  }

  public void display(){
    System.out.println("Name: "+name);
    System.out.println("Account Number: "+accno);
    System.out.println("Principal: Rs."+p);
  }

  public static void main(String[] args){
    String n="";
    long a=0l;
    double p=0.0d;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter customer name: ");
    n = sc.nextLine();
    System.out.println("Enter account number: ");
    a = sc.nextLong();
    System.out.println("Enter principal amount: ");
    p = sc.nextDouble();
    Bank ob1 = new Bank(n, a, p);
    ob1.display();
    sc.close();
  }
}

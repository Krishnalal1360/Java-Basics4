package Unsolved_Problems;

import java.util.Scanner;

public class Account extends Bank{
  
  public double amt;

  Account(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter customer name: ");
    String n = sc.nextLine();
    System.out.println("Enter account number: ");
    long a = sc.nextLong();
    System.out.println("Enter principal amount: ");
    double p = sc.nextDouble();
    super(n, a, p);
  }

  public void deposit(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount to deposit: ");
    this.amt = sc.nextDouble();
    this.p = this.p+this.amt;
    super.display();
  }

  public void withdraw(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount to withdraw: ");
    this.amt = sc.nextDouble();
    if(this.amt > this.p){
      System.out.println("Insufficient balance!");
      System.exit(0);
    }
    this.p = this.p-this.amt;
    if(this.p < 500){
      System.out.println("Penalty must be imposed as principal is less than 500.");
      this.p = this.p-((500-this.p)/10.0);
    }
    super.display();
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    System.out.println("\nFor Object 1: ");
    Account ob1 = new Account();
    ob1.deposit();
    ob1.withdraw(); 
    ob1.display();  
    sc.close();
  }
}

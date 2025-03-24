package Unsolved_Problems;

import java.util.Scanner;

public class Personal{
  
  public String name, pan;
  public double basic_pay;
  public long acc_no;

  Personal(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    this.name = sc.nextLine();
    System.out.println("Enter PAN Number: ");
    this.pan = sc.next();
    System.out.println("Enter Basic Pay: ");
    this.basic_pay = sc.nextDouble();
    System.out.println("Enter Account Number: ");
    this.acc_no = sc.nextLong();
  }

  public void display(){
    System.out.println("Name: "+name);
    System.out.println("PAN Number: "+pan);
    System.out.println("Basic Pay: Rs."+basic_pay);
    System.out.println("Account Number: "+acc_no);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Personal ob1 = new Personal();
    ob1.display();
  }
}
package Unsolved_Problems;

import java.util.Scanner;

public class Stock{

  public String item;
  public int qty;
  public double rate, amt;

  Stock(String i, int q, double r){
    this.item = i;
    this.qty = q;
    this.rate = r;
    this.amt = this.rate*this.qty;
  }

  public void display(){
    System.out.println("Item name: "+this.item);
    System.out.println("Quantity: "+this.qty);
    System.out.println("Rate: Rs."+this.rate);
    System.out.println("Amount: Rs."+this.amt);
  }

  public static void main(String[] args){
    String i="";
    int q=0;
    double r=0.0d;
    Scanner sc = new Scanner(System.in);  
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter item name: ");
    i = sc.nextLine();
    System.out.println("Enter quantity in stock: ");
    q = sc.nextInt();
    System.out.println("Enter rate before purchase: ");
    r = sc.nextDouble();
    Stock ob1 = new Stock(i, q, r);
    ob1.display();
    sc.close();
  }
}
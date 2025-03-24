package Unsolved_Problems;

import java.util.Scanner;

public class Purchase extends Stock{
  
  public int pqty;
  public double prate;

  Purchase(int qt, double rt){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter item name: ");
    String i = sc.nextLine();
    System.out.println("Enter quantity in stock: ");
    int q = sc.nextInt();
    System.out.println("Enter rate before purchase: ");
    double r = sc.nextDouble();
    super(i, q, r);
    this.pqty = qt;
    this.prate = rt;
    super.display();
  }

  public void update(){
    if(this.pqty <= this.qty){
      this.qty = this.qty-this.pqty;
      if(this.rate-this.prate == 0){
        this.amt = this.amt-(this.prate*this.pqty);
      }else{
        System.out.println("No Bargaining allowed!!");
        System.exit(0);
      }
    }else{
      System.out.println("Out Of Stock!!");
      System.exit(0);
    }
  }

  public void display(){
    System.out.println("Purchased quantity: "+this.pqty);
    System.out.println("Purchased rate: Rs."+this.prate);
    System.out.println("Purchased Amount: Rs."+this.amt);
  }

  public static void main(String[] args){
    int q=0;
    double r=0.0d;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter quantity to purchase: ");
    q = sc.nextInt();
    System.out.println("Enter rate to purchase: ");
    r = sc.nextDouble();
    Purchase ob1 = new Purchase(q, r);  
    ob1.update();
    ob1.display();
    sc.close();
  }
}
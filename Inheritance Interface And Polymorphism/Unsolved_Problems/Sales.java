package Unsolved_Problems;

import java.util.Scanner;

public class Sales extends Representative{
  
  public int bno, qty;
  public double pr, sale;
  public String pname;

  Sales(){
    super();
    this.bno = 0;
    this.qty = 0;
    this.pr = 0.0d;
    this.sale = 0.0d;
    this.pname = "";
  }

  public void read(int b, int q, double p, String pn){
    String n="", a="";
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter representative name: ");
    n = sc.nextLine();
    System.out.println("Enter representative address: ");
    a = sc.nextLine();
    super.read(n, a);
    this.bno = b;
    this.qty = q;
    this.pr = p;
    this.pname = pn;
  }

  public void cal(){
    this.sale = this.qty*this.pr;
  }

  public void display(){
    super.display();
    System.out.println("Bill number: "+this.bno);
    System.out.println("Product name: "+this.pname);
    System.out.println("Quantity: "+this.qty);
    System.out.println("Price: Rs."+this.pr);
    System.out.println("Sale: Rs."+this.sale);
  }

  public static void main(String[] args){
    int b=0, q=0;
    double p=0.0d;
    String pn="";
    System.out.println("\nFor Object 1: ");
    Sales ob1 = new Sales();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter bill number: ");
    b = sc.nextInt();
    System.out.println("Enter quantity: ");
    q = sc.nextInt();
    System.out.println("Enter price for a product: ");
    p = sc.nextDouble();
    System.out.println("Enter product name: ");
    sc.nextLine();
    pn = sc.nextLine();
    ob1.read(b, q, p, pn);
    ob1.cal();
    ob1.display();
    sc.close();
  }
}

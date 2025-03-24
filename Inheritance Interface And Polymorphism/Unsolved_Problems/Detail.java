package Unsolved_Problems;

import java.util.Scanner;

public class Detail{
  
  public String name, address;
  public long telno;
  public double rent;

  Detail(String n, String a, long t, double r){
    this.name = n;
    this.address = a;
    this.telno = t;
    this.rent = r;
  }

  public void show(){
    System.out.println("Name: "+this.name);
    System.out.println("Address: "+this.address);
    System.out.println("Telephone number: "+this.telno);
    System.out.println("Rent: Rs."+this.rent);
  }

  public static void main(String[] args){
    String n="", a="";
    long t=0l;
    double r=0.0d;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter name: ");
    n = sc.nextLine();
    System.out.println("Enter address: ");
    a = sc.nextLine();
    System.out.println("Enter telephone number: ");
    t = sc.nextLong();
    System.out.println("Enter rent: ");
    r = sc.nextDouble();
    Detail ob1 = new Detail(n, a, t, r);
    ob1.show();
    sc.close();
  }
}

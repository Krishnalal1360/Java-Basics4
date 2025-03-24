package Unsolved_Problems;

import java.util.Scanner;

public class Representative{
  
  public String name, address;

  Representative(){
    this.name = "";
    this.address = "";
  }

  public void read(String n, String add){
    this.name = n;
    this.address = add;
  }

  public void display(){
    System.out.println("Name: "+this.name);
    System.out.println("Address: "+this.address);
  }

  public static void main(String[] args){
    String n="", a="";
    System.out.println("\nFor Object 1: ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter representative name: ");
    n = sc.nextLine();
    System.out.println("Enter representative address: ");
    a = sc.nextLine();
    Representative ob1 = new Representative();
    ob1.read(n, a);
    ob1.display();  
    sc.close();
  }
}

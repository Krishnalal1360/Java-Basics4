package Nested_Class_Inheritance;

import java.util.Scanner;

public class Parent{
  
  public String n, st1, st2;

  class Paternal{

    public String n;

    Paternal(String n){
      this.n = n;
    }

    public void display(){
      System.out.println("In Paternal Class");
      System.out.println("Daddy Name: "+this.n);
    }
  }

  class Maternal{

    public String n;

    Maternal(String n){
      this.n = n;
    }

    public void display(){
      System.out.println("In Maternal Class");
      System.out.println("Mommy Name: "+this.n);
    }
  }

  Parent(String n){
    this.n = n;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Daddy Name: ");
    this.st1 = sc.nextLine();
    System.out.println("Enter Mommy Name: ");
    this.st2 = sc.nextLine();
  }

  public void display(){
    System.out.println("In Parent Class");
    System.out.println("Family Type: "+this.n);
    Paternal ob1 = new Paternal(this.st1);
    Maternal ob2 = new Maternal(this.st2);
    ob1.display();
    ob2.display();
  }

  public static void main(String[] args){
    String st="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter family type: ");
    st = sc.nextLine();
    Parent ob = new Parent(st);
    ob.display();
    sc.close();
  }
}

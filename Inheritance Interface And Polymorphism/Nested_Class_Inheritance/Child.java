package Nested_Class_Inheritance;

import java.util.Scanner;

public class Child extends Parent{
  
  public String n;

  Child(String n){
    this.n = n;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Family Type: ");
    String st = sc.nextLine();
    super(st);
  }

  public void display(){
    super.display();
    System.out.println("In Child Class");
    System.out.println("Child's Name: "+this.n);
  }

  public static void main(String[] args){
    String st="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter Child's Name: ");
    st = sc.nextLine();
    Child ob1 = new Child(st);
    ob1.display();
    sc.close();
  }
}

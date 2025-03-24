package Unsolved_Problems;

import java.util.Scanner;

public class Base{
  
  public int n1, n2;

  Base(){
    this.n1 = 0;
    this.n2 = 0;
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    this.n1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    this.n2 = sc.nextInt();
  }

  public void display(){
    System.out.println("The first number is: "+this.n1);
    System.out.println("The second number is: "+this.n2);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Base ob1 = new Base();
    ob1.accept();
    ob1.display();
  }
}

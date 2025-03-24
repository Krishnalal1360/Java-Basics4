package Unsolved_Problems;

import java.util.Scanner;

public class Calculate{

  public int n1, n2;

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    this.n1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    this.n2 = sc.nextInt();
  }

  public void display(){
    System.out.println("First number: "+this.n1);
    System.out.println("Second number: "+this.n2);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Calculate ob1 = new Calculate();
    ob1.accept();
    ob1.display();
  }
}

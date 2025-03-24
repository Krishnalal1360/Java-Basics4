package Unsolved_Problems;

import java.util.Scanner;

public class BasePro{
  
  public int n1, n2;

  public void enter(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    this.n1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    this.n2 = sc.nextInt();
  }

  public void show(){
    System.out.println("First number: "+this.n1);
    System.out.println("Second number: "+this.n2);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    BasePro ob1 = new BasePro();
    ob1.enter();
    ob1.show();
  }
}
package Unsolved_Problems;

import java.util.Scanner;

public class Number{
  
  public int n;

  Number(int nn){
    this.n = nn;
  }

  public int factorial(int a){
    if(a == 1){
      return 1;
    }else{
      return a*factorial(a-1);
    }
  }

  public void display(){
    System.out.println("Number: "+this.n);
    System.out.println("Factorial: "+factorial(this.n));
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Number ob1 = new Number(n);
    ob1.display();
    sc.close();
  }
}
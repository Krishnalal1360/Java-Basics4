package Unsolved_Problems;

import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Integer;

public class Series extends Number{
  
  public int sum;

  Series(int nn){
    super(nn);
  }

  public void calsum(){
    int r=0;
    String st = String.valueOf(this.n);
    StringBuffer sb = new StringBuffer(st);
    st = sb.reverse().toString();
    this.n = Integer.parseInt(st);
    while(this.n > 0){
      r = this.n%10;
      this.sum = this.sum+this.factorial(r);
      this.n = this.n/10;
    }
  }

  public void display(){
    System.out.println("Sum: "+this.sum);
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    System.out.println("Number: "+n);
    Series ob1 = new Series(n);
    ob1.calsum(); 
    ob1.display();  
    sc.close();
  }
}

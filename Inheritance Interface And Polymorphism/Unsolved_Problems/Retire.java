package Unsolved_Problems;

import java.util.Scanner;

public class Retire extends Personal{
  
  public int yrs;
  public double pf, grat;

  Retire(){
    super();
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter years of service: ");
    this.yrs = sc.nextInt();
  }

  public void provident(){
    double pfp=0.0d;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter provident fund percentage: ");
    pfp = sc.nextDouble();
    this.pf = (pfp/100.0)*this.basic_pay*this.yrs;
  }

  public void gratuity(){
    int m=0, y=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of months for gratuity amount: ");
    m = sc.nextInt();
    System.out.println("Enter number of years for gratuity eligibility: ");
    y = sc.nextInt();
    if(this.yrs >= y){
      this.grat = this.basic_pay*m;
    }else{
      this.grat = 0.0d;
    }
  }

  public void display(){
    super.display();
    System.out.println("Years Of Service: "+this.yrs);
    System.out.println("Provident Fund: Rs."+this.pf);
    System.out.println("Gratuity: Rs."+this.grat);
    System.out.println("Total Salary: Rs."+(this.basic_pay+this.pf+this.grat));
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Retire ob1 = new Retire();
    ob1.provident();
    ob1.gratuity();
    ob1.display();
  }
}
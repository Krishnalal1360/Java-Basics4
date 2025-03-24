package Unsolved_Problems;

import java.util.Scanner; 

public class Bill extends Detail{

  public int n;
  public double amt;

  Bill(int n){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter name: ");
    String nm = sc.nextLine();
    System.out.println("Enter address: ");
    String a = sc.nextLine();
    System.out.println("Enter telephone number: ");
    long t = sc.nextLong();
    System.out.println("Enter rent: ");
    double r = sc.nextDouble();
    super(nm, a, t, r);
    this.n = n;
  }

  public void cal(){
    if((this.n >= 1) && (this.n <= 100)){
      this.amt = this.rent;
    }else if((this.n >= 101) && (this.n <= 200)){
      this.amt = this.rent+(this.n-100)*0.60;
    }else if((this.n >= 201) && (this.n <= 300)){
      this.amt = this.rent+(100*0.60)+((this.n-200)*0.80);
    }else{
      this.amt = this.rent+(100*0.60)+(100*0.80)+((this.n-300)*1.00);
    }
  }

  public void show(){
    super.show();
    System.out.println("Number of calls made: "+this.n);
    System.out.println("Bill amount: Rs."+this.amt);
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter number of calls made: ");
    n = sc.nextInt();
    Bill ob1 = new Bill(n);
    ob1.cal();
    ob1.show();
    sc.close();
  }
}

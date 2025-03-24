import java.util.Scanner;

public class IncomeTax extends Employee1{

  public double da, hra, gross, ansal, tax, scharge;

  public void input(){
    super.getdata();
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Dearness Allowance: ");
    this.da = sc.nextDouble();
    System.out.println("Enter House Rent Allowance: ");
    this.hra = sc.nextDouble();
  }

  public void compute(){
    this.gross = this.basic+this.da+this.hra;
    this.ansal = this.gross*12;
    if(this.ansal <= 250000){
      this.tax = 0;
    }else if((this.ansal > 250000) && (this.ansal <= 500000)){
      this.tax = this.ansal*0.10;
    }else if((this.ansal > 500000) && (this.ansal <= 1000000)){
      this.tax = 5000+(this.ansal*0.20);
    }else{
      this.tax = 25000+(this.ansal*0.30);
      this.scharge = this.tax*0.10;
    }
  }

  public void display(){
    super.showdata();
    System.out.println("Dearness Allowance: Rs."+this.da);
    System.out.println("House Rent Allowance: Rs."+this.hra);
    System.out.println("Gross Pay: Rs."+this.gross);
    System.out.println("Annual Salary: Rs."+this.ansal);
    System.out.println("Income Tax: Rs."+this.tax);
    System.out.println("Surcharge: Rs."+this.scharge);
    System.out.println("Total Tax Paid: Rs."+(this.tax+this.scharge));
    System.out.println("Net Salary: Rs."+(this.ansal-(this.tax+this.scharge)));
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    IncomeTax ob1 = new IncomeTax();
    ob1.input();
    ob1.compute();
    ob1.display();
  }
}
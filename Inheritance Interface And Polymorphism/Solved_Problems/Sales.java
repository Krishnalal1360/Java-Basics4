import java.util.Scanner;

public class Sales extends Product{

  public int day;
  public double tax, totamt;

  Sales(){
    String n="";
    int c=0;
    double p=0.0d;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the product: ");
    n = sc.nextLine();
    System.out.println("Enter the code of the product: ");
    c = sc.nextInt();
    System.out.println("Enter the total sale amount of the product: ");
    p = sc.nextDouble();
    super(n, c, p);
    System.out.println("Enter the number of days taken to pay the sale amount: ");
    this.day = sc.nextInt();
  }

  public void compute(){
    int d=0;
    double stp=0.0d, fp=0.0d, f=0.0d;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the service tax percentage: ");
    stp = sc.nextDouble();
    System.out.println("Enter the fine percentage: ");
    fp = sc.nextDouble();
    System.out.println("Enter the day limit to pay the sale amount: ");
    d = sc.nextInt();
    this.tax = this.amount*(stp/100.0);
    if(this.day > d){
      f = this.amount*(fp/100.0);
    }
    this.totamt = this.amount+this.tax+f;
  }

  public void show(){
    super.show();
    System.out.println("Number of days taken: "+this.day);
    System.out.println("Service tax: Rs."+this.tax);
    System.out.println("Total amount: Rs."+this.totamt);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Sales ob1 = new Sales();
    ob1.compute();
    ob1.show();
  }
}
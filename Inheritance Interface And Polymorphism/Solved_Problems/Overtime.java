import java.util.Scanner;

public class Overtime extends Employee{

  public int nd;
  public float rate;

  Overtime(int n, float r){
    int e;
    double b;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee Code: ");
    e = sc.nextInt();
    System.out.println("Enter Basic Pay: ");
    b = sc.nextDouble();
    super(e, b);
    this.nd = n;
    this.rate = r;
  }

  public double calculate(){
    return this.bpay+(this.nd*this.rate);
  }

  public void show(){
    super.display();
    System.out.println("Extra hours worked: "+this.nd);
    System.out.println("Rate for extra hours: Rs."+this.rate);
    System.out.println("Gross Pay: Rs."+calculate());
  }

  public static void main(String[] args){
    int n;
    float r;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter number of extra hours worked: ");
    n = sc.nextInt();
    System.out.println("Enter rating for extra hours: ");
    r = sc.nextFloat();
    Overtime ob1 = new Overtime(n, r);
    ob1.show();
    sc.close();
  }
}
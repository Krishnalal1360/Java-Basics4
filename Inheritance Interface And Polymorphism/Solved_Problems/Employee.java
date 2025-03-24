import java.util.Scanner;

public class Employee{

  public int empc;
  public double bpay;

  Employee(int c, double b){
    this.empc = c;
    this.bpay = b;
  }

  public void display(){
    System.out.println("Employee Code: " + empc);
    System.out.println("Basic Pay: Rs." + bpay);
  }

  public static void main(String[] args){
    int e;
    double b;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter Employee Code: ");
    e = sc.nextInt();
    System.out.println("Enter Basic Pay: ");
    b = sc.nextDouble();
    Employee ob1 = new Employee(e, b);
    ob1.display();
    sc.close();
  }
}
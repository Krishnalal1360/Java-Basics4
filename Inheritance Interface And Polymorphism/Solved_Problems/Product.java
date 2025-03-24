import java.util.Scanner;

public class Product{

  public String name;
  public int code;
  public double amount;

  Product(String n, int c, double p){
    this.name = n;
    this.code = c;
    this.amount = p;
  }

  public void show(){
    System.out.println("Name: "+this.name);
    System.out.println("Code: "+this.code);
    System.out.println("Amount: Rs."+this.amount);
  }

  public static void main(String[] args){
    String n="";
    int c=0;
    double p=0.0d;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter the name of the product: ");
    n = sc.nextLine();
    System.out.println("Enter the code of the product: ");
    c = sc.nextInt();
    System.out.println("Enter the total sale amount of the product: ");
    p = sc.nextDouble();
    Product ob1 = new Product(n, c, p);
    ob1.show();
    sc.close();
  }
}
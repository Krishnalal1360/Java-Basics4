import java.util.Scanner;

public class Perimeter{

  public int a, b;

  Perimeter(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length: ");
    this.a = sc.nextInt();
    System.out.println("Enter breadth: ");
    this.b = sc.nextInt();
  }

  public double calculate(){
    return 2*(this.a+this.b);
  }

  public void show(){
    System.out.println("Length: "+this.a+" units");
    System.out.println("Breadth: "+this.b+" units");
    System.out.println("Perimeter: "+calculate()+" units");
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Perimeter ob1 = new Perimeter();
    ob1.show();
  }
}
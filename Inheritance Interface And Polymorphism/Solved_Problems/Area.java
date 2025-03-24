import java.util.Scanner;

public class Area extends Perimeter{

  public int h, flag=0;
  public double area;

  Area(){
    super();
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for height between longer sides.");
    System.out.println("Enter 2 for height between shorter sides.");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    switch(ch){
      case 1:
      System.out.println("Enter height: ");
      this.h = sc.nextInt();
      this.flag = 0;
      break;
      case 2:
      System.out.println("Enter height: ");
      this.h = sc.nextInt();
      this.flag = 1;
      break;
      default:
      System.out.println("Invalid choice");
    }
  }

  public void doarea(){
    if(this.flag == 0){
      this.area = this.a*this.h;
    }else{
      this.area = this.b*this.h;
    }
  }

  public void show(){
    super.show();
    System.out.println("Height: "+this.h+" units");
    System.out.println("Area: "+this.area+" square units");
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Area ob1 = new Area();
    ob1.doarea();
    ob1.show();
  }
}
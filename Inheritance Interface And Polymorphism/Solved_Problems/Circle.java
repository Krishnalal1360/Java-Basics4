import java.util.Scanner;
import java.lang.Math;

public class Circle extends Plane{

  public int x2, y2;
  public double radius, area;

  Circle(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the x-coordinate of first end: ");
    int x = sc.nextInt();
    System.out.println("Enter the y-coordinate of first end: ");
    int y = sc.nextInt();
    super(x, y);
    System.out.println("Enter the x-coordinate of second end: ");
    this.x2 = sc.nextInt();
    System.out.println("Enter the y-coordinate of second end: ");
    this.y2 = sc.nextInt();
  }

  public void findRadius(){
    int x_diff=0, y_diff=0;
    double x=0.0d, y=0.0d;
    x_diff = Math.abs(this.x2-this.x1);
    y_diff = Math.abs(this.y2-this.y1);
    x = Math.pow(x_diff, 2.0);
    y = Math.pow(y_diff, 2.0);
    this.radius = Math.sqrt(x+y)/2.0;
  }

  public void findArea(){
    this.area = Math.PI*Math.pow(this.radius, 2.0);
  }

  public void show(){
    super.show();
    System.out.println("X-coordinate for second end: "+this.x2+" units");
    System.out.println("Y-coordinate for second end: "+this.y2+" units");
    System.out.println("Radius: "+this.radius+" units");
    System.out.println("Area: "+Math.round(this.area)+" square units");
  }

  public static void main(String[] args) {
    System.out.println("\nFor Object 1: ");
    Circle ob1 = new Circle();
    ob1.findRadius();
    ob1.findArea();
    ob1.show(); 
  }
}
import java.util.Scanner;

public class Plane{

  public int x1, y1;

  Plane(int nx, int ny){
    this.x1 = nx;
    this.y1 = ny;
  }

  public void show(){
    System.out.println("X-coordinate for first end: "+this.x1+" units");
    System.out.println("Y-coordinate for first end: "+this.y1+" units");
  }

  public static void main(String[] args){
    int x=0, y=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter the x-coordinate of first end: ");
    x = sc.nextInt();
    System.out.println("Enter the y-coordinate of first end: ");
    y = sc.nextInt();
    Plane ob1 = new Plane(x, y);
    ob1.show();
    sc.close();
  }
}

package Unsolved_Problems;

import java.util.Scanner;

public class Point1{
  
  public double x1, y1, x2, y2, x3, y3, x4, y4, slope;

  Point1(){
    this.x1 = 0.0d;
    this.y1 = 0.0d;
    this.x2 = 0.0d;
    this.y2 = 0.0d;
    this.x3 = 0.0d;
    this.y3 = 0.0d;
    this.x4 = 0.0d;
    this.y4 = 0.0d;
  }

  public void acceptPoint(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x1-coordinate: ");
    this.x1 = sc.nextDouble();
    System.out.println("Enter y1-coordinate: ");
    this.y1 = sc.nextDouble();
    System.out.println("Enter x2-coordinate: ");
    this.x2 = sc.nextDouble();
    System.out.println("Enter y2-coordinate: ");
    this.y2 = sc.nextDouble();
    System.out.println("Enter x3-coordinate: ");
    this.x3 = sc.nextDouble();
    System.out.println("Enter y3-coordinate: ");
    this.y3 = sc.nextDouble();
    System.out.println("Enter x4-coordinate: ");
    this.x4 = sc.nextDouble();
    System.out.println("Enter y4-coordinate: ");
    this.y4 = sc.nextDouble();
  }

  public void show(){
    System.out.println("X1-coordinate value: "+this.x1+" units");
    System.out.println("Y1-coordinate value: "+this.y1+" units");
    System.out.println("X2-coordinate value: "+this.x2+" units");
    System.out.println("Y2-coordinate value: "+this.y2+" units");
    System.out.println("X3-coordinate value: "+this.x3+" units");
    System.out.println("Y3-coordinate value: "+this.y3+" units");
    System.out.println("X4-coordinate value: "+this.x4+" units");
    System.out.println("Y4-coordinate value: "+this.y4+" units");
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Point1 ob1 = new Point1();
    ob1.acceptPoint();
    ob1.show();
  }
}
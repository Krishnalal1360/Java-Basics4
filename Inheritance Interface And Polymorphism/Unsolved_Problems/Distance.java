package Unsolved_Problems;

import java.util.Scanner;
import java.lang.Math;

public class Distance extends Point{
  
  public double midx, midy;

  Distance(){
    super();
    this.midx = 0.0d;
    this.midy = 0.0d;
  }

  public void readPoint(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x1-coordinate value: ");
    this.x1 = sc.nextDouble();
    System.out.println("Enter y1-coordinate value: ");
    this.y1 = sc.nextDouble();
    System.out.println("Enter x2-coordinate value: ");
    this.x2 = sc.nextDouble();
    System.out.println("Enter y2-coordinate value: ");
    this.y2 = sc.nextDouble();
  }

  public void findDistance(){
    this.dis = Math.sqrt(Math.pow(this.x2-this.x1, 2)+Math.pow(this.y2-this.y1, 2));
  }

  public void findMidPoint(){
    this.midx = (this.x1+this.x2)/2.0;
    this.midy = (this.y1+this.y2)/2.0;
  }

  public void show(){
    super.show();
    System.out.println("Distance: "+Math.round(this.dis)+" units");
    System.out.println("Mid-Point: ("+Math.round(this.midx)+", "+Math.round(this.midy)+")");
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Distance ob1 = new Distance();
    ob1.readPoint();
    ob1.findDistance();
    ob1.findMidPoint();
    ob1.show();
  }
}

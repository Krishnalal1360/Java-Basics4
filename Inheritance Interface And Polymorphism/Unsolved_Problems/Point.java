package Unsolved_Problems;

public abstract class Point{
  
  public double x1, y1, x2, y2, dis;

  Point(){
    this.x1 = 0;
    this.y1 = 0;
    this.x2 = 0;
    this.y2 = 0;
    this.dis = 0;
  }

  public abstract void readPoint();

  public abstract void findDistance();

  public void show(){
    System.out.println("X1-coordinate value: "+this.x1+" units");
    System.out.println("Y1-coordinate value: "+this.y1+" units");
    System.out.println("X2-coordinate value: "+this.x2+" units");
    System.out.println("Y2-coordinate value: "+this.y2+" units");
  }
}
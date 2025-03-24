package Unsolved_Problems;

public class Slope extends Point1{
  
  public double m1, m2;

  Slope(){
    super();
    this.m1 = 0.0d;
    this.m2 = 0.0d;
  }

  public void findSlope(){
    super.acceptPoint();
    this.m1 = (this.y2-this.y1)/(this.x2-this.x1);
    this.m2 = (this.y4-this.y3)/(this.x4-this.x3);
  }

  public void display(){
    super.show();
    System.out.println("Slope 1: "+this.m1);
    System.out.println("Slope 2: "+this.m2);
  }

  public void check(){
    if(this.m1 == this.m2){
      System.out.println("Lines are parallel to each other.");
    }
    if(this.m1*this.m2 == -1){
      System.out.println("Lines are perpendicular to each other.");
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Slope ob1 = new Slope();
    ob1.findSlope();
    ob1.display();
    ob1.check();
  }
}

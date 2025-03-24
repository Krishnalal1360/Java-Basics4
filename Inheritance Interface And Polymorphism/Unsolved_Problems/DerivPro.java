package Unsolved_Problems;

public class DerivPro extends BasePro{
  
  public float result;

  public void prod(){
    super.enter();
    this.result = this.n1*this.n2;
  }

  public void disp(){
    super.show();
    System.out.println("Product of "+this.n1+" and "+this.n2+" is "+this.result);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    DerivPro ob1 = new DerivPro();
    ob1.prod();
    ob1.disp();
  }
}

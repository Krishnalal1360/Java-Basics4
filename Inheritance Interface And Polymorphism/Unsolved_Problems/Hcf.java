package Unsolved_Problems;

public class Hcf extends Calculate{

  public int h;

  public void findhcf(){
    super.accept();
    if(this.n1 > this.n2){
      for(int i=1;i<=this.n2;i++){
        if((this.n1%i == 0) && (this.n2%i == 0)){
          this.h = i;
        }
      }
    }else{
      for(int i=1;i<=this.n1;i++){
        if((this.n1%i == 0) && (this.n2%i == 0)){
          this.h = i;
        }
      }
    }
  }

  public void show(){
    super.display();
    System.out.println("HCF of "+this.n1+" and "+this.n2+" is "+this.h);
  }
  
  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Hcf ob1 = new Hcf();
    ob1.findhcf();
    ob1.show();
  }
}

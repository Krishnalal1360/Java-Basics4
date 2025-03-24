package Unsolved_Problems;

public class Derive extends Base{
  
  public int hc, lc;

  Derive(){
    super();
    this.hc = 0;
    this.lc = 0;
    super.accept();
  }

  public void swap(){
    int n=0;
    if(this.n1 < this.n2){
      n = this.n1;
      this.n1 = this.n2;
      this.n2 = n;
    }
  }

  public void findHcf(){
    for(int i=1;i<=this.n2;i++){
      if((this.n1%i == 0) && (this.n2%i == 0)){
        this.hc = i;
      }else{
        continue;
      }
    }
  }

  public void findLcm(){
    this.lc = (this.n1*this.n2)/this.hc;
  }

  public void show(){
    super.display();
    System.out.println("HCF: "+this.hc);
    System.out.println("LCM: "+this.lc);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Derive ob1 = new Derive();
    ob1.swap();
    ob1.findHcf();
    ob1.findLcm();
    ob1.show();
  }
}
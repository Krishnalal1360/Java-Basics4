import java.util.Scanner;

public class Compute extends Library{

  public int d;
  public float f;

  Compute(){
    super();
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of days taken: ");
    this.d = sc.nextInt();
    this.f = 0.0f;
  }

  public void fine(){
    if((this.d >= 1) && (this.d <= 5)){
      this.f = 0.0f; 
    }else if((this.d > 5) && (this.d <= 10)){
      this.f = (this.d-5)*2.0f;
    }else{
      this.f = (this.d-10)*3.0f+10.0f;
    }
  }

  public void display(){
    super.show();
    System.out.println("Number of days taken: "+this.d);
    System.out.println("Fine: Rs."+this.f);
    System.out.println("Total fine: Rs."+(this.f+(0.02*this.p*this.d)));
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Compute ob1 = new Compute();
    ob1.fine();
    ob1.display();
  }
}
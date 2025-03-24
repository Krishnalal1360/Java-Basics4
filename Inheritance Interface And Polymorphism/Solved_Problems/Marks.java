import java.util.Scanner;

public class Marks extends Student{

  public float p, c, m, cs, e, tot, per;
  public char gd;

  public void readdata(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    super.inputdata();
    System.out.println("Enter marks in Physics: ");
    this.p = sc.nextFloat();
    System.out.println("Enter marks in Chemistry: ");
    this.c = sc.nextFloat();
    System.out.println("Enter marks in Mathematics: ");
    this.m = sc.nextFloat();
    System.out.println("Enter marks in Computer Science: ");
    this.cs = sc.nextFloat();
    System.out.println("Enter marks in English: ");
    this.e = sc.nextFloat();
  }

  public void compute(){
    this.tot = p+c+m+cs+e;
    this.per = (tot/500.0f)*100.0f;
    if(this.per >= 90){
      this.gd = 'A';
    }else if((this.per >= 60) && (this.per < 90)){
      this.gd = 'B';
    }else if((this.per >= 40) && (this.per < 60)){
      this.gd = 'C';
    }else{
      this.gd = 'D';
    }
  }

  public void showdata(){
    super.printdata();
    System.out.println("Marks in Physics: "+this.p);
    System.out.println("Marks in Chemistry: "+this.c);
    System.out.println("Marks in Mathematics: "+this.m);
    System.out.println("Marks in Computer Science: "+this.cs);
    System.out.println("Marks in English: "+this.e);
    System.out.println("Total marks: "+this.tot);
    System.out.println("Percentage: "+this.per);
    System.out.println("Grade: "+this.gd);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Marks ob1 = new Marks();
    ob1.readdata();
    ob1.compute();
    ob1.showdata();

    System.out.println("\nFor Object 2: ");
    Marks ob2 = new Marks();
    ob2.readdata();
    ob2.compute();
    ob2.showdata();
  }
}
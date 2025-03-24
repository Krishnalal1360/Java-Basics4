package Unsolved_Problems;

import java.util.Scanner;

public class Result extends Student{

  public float sub1, sub2, sub3, tot, avg;
  public String stream;

  Result(float s1, float s2, float s3){
    int r=0, i=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter roll number: ");
    r = sc.nextInt();
    System.out.println("Enter id number: ");
    i = sc.nextInt();
    super(r, i);
    this.sub1 = s1;
    this.sub2 = s2;
    this.sub3 = s3;
  }

  public void calculate(){
    this.tot = this.sub1+this.sub2+this.sub3;
    this.avg = this.tot/3.0f;
  }

  public void getstream(){
    if(this.avg >= 80){
      this.stream = "Science";
    }else if((this.avg >= 60) && (this.avg < 80)){
      this.stream = "Commerce";
    }else{
      this.stream = "Arts";
    }
  }

  public void display(){
    super.show();
    System.out.println("Total Marks: "+this.tot);
    System.out.println("Average Marks: "+this.avg);
    System.out.println("Stream: "+this.stream);
  }

  public static void main(String[] args){
    float s1=0.0f, s2=0.0f, s3=0.0f;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter marks for Subject 1: ");
    s1 = sc.nextFloat();
    System.out.println("Enter marks for Subject 2: ");
    s2 = sc.nextFloat();
    System.out.println("Enter marks for Subject 3: ");
    s3 = sc.nextFloat();
    Result ob1 = new Result(s1, s2, s3);
    ob1.calculate();
    ob1.getstream();
    ob1.display();
    sc.close();
  }
}

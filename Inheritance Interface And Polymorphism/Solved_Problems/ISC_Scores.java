import java.util.Scanner;

public class ISC_Scores{

  public int n;
  public float ar[][];

  public void iscscores(){
    int f=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter number of subjects: \n");
    this.n = sc.nextInt();
    this.ar = new float[n][2];
    System.out.println("\nEnter subject code and marks for "+this.n+" subjects.\n");
    for(int i=0;i<this.ar.length;i++){
      System.out.println("For Subject "+(i+1)+": \n");
      for(int j=0;j<this.ar[i].length;j++){
        if(f == 0){
          System.out.print("Enter subject code: ");
          this.ar[i][j] = sc.nextFloat();
          f = 1;
          System.out.println();
          continue;
        }
        if(f == 1){
          System.out.print("Enter marks: ");
          this.ar[i][j] = sc.nextFloat();
          f = 0;
          System.out.println();
          continue;
        }
      }
    }
  }

  public void display(){
    int f=0;
    System.out.println("\nSubject Code\tMarks");
    for(int i=0;i<this.ar.length;i++){
      for(int j=0;j<this.ar[i].length;j++){
        if(f == 0){
          System.out.print((int)(this.ar[i][j])+"\t\t");
          f = 1;
          continue;
        }
        if(f == 1){
          System.out.print(this.ar[i][j]);
          f = 0;
          continue;
        }
      }
      System.out.println();
    }
  }

  public int point(float m){
    if(m >= 90){
      return 1;
    }else if(m >= 80 && m < 90){
      return 2;
    }else if(m >= 70 && m < 80){
      return 3;
    }else if(m >= 60 && m < 70){
      return 4;
    }else if(m >= 50 && m < 60){
      return 5;
    }else if(m >= 40 && m < 50){
      return 6;
    }else if(m >= 30 && m < 40){
      return 7;
    }else{
      return 0;
    }
  }

  public void sort(){
    float temp1=0.0f, temp2=0.0f;
    for(int i=0;i<this.n-1;i++){
      temp1 = this.ar[i][0];
      temp2 = this.ar[i][1];
      for(int j=i+1;j<this.n;j++){
        if(this.ar[j][1] > this.ar[i][1]){
          this.ar[i][1] = this.ar[j][1];
          this.ar[j][1] = temp2;
          temp2 = this.ar[i][1];

          this.ar[i][0] = this.ar[j][0];
          this.ar[j][0] = temp1;
          temp1 = this.ar[i][0];
        }
      }
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    ISC_Scores ob1 = new ISC_Scores();
    ob1.iscscores();
    ob1.display();
    ob1.sort();
    ob1.display();  
  }
}
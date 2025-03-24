package Unsolved_Problems;

import java.util.Scanner;

public class Matrix1{
  
  public int m, n, a[][], r, c, b[][];

  Matrix1(){
    this.m = 0;
    this.n = 0;
    this.a = new int[this.m][this.n];
    this.r = 0;
    this.c = 0;
    this.b = new int[this.r][this.c];
  }

  public void readLimit(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);  
    System.out.println("Matrix a[][]");
    System.out.println("Enter number of rows: ");
    this.m = sc.nextInt();
    System.out.println("Enter number of columns: ");
    this.n = sc.nextInt();
    this.a = new int[this.m][this.n];
    System.out.println("Matrix b[][]");
    System.out.println("Enter number of rows: ");
    this.r = sc.nextInt();
    System.out.println("Enter number of columns: ");
    this.c = sc.nextInt();
    this.b = new int[this.r][this.c];
  }

  public void input_a(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements for Matrix a[][].");
    for(int i=0;i<this.a.length;i++){
      for(int j=0;j<this.a[i].length;j++){
        System.out.print("Enter element at location a["+i+"]["+j+"]: ");
        this.a[i][j] = sc.nextInt();
        System.out.println();
      }
    }
  }

  public void input_b(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements for Matrix b[][].");
    for(int i=0;i<this.b.length;i++){
      for(int j=0;j<this.b[i].length;j++){
        System.out.print("Enter element at location b["+i+"]["+j+"]: ");
        this.b[i][j] = sc.nextInt();
        System.out.println();
      }
    }
  }

  public void showmats(){
    System.out.println("Matrix a[][]");
    for(int i=0;i<this.a.length;i++){
      for(int j=0;j<this.a[i].length;j++){
        System.out.print(this.a[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println("Matrix b[][]");
    for(int i=0;i<this.b.length;i++){
      for(int j=0;j<this.b[i].length;j++){
        System.out.print(this.b[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Matrix1 ob1 = new Matrix1();  
    ob1.readLimit();
    ob1.input_a();
    ob1.input_b();
    ob1.showmats();
  }
}

package Unsolved_Problems;

import java.util.Scanner;

public class Student{

  public int rollno, idno;

  Student(int nr, int ni){
    this.rollno = nr;
    this.idno = ni;
  }

  public void show(){
    System.out.println("Roll Number: "+rollno);
    System.out.println("ID Number: "+idno);
  }

  public static void main(String[] args){
    int r=0, i=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter roll number: ");
    r = sc.nextInt();
    System.out.println("Enter id number: ");
    i = sc.nextInt();
    Student ob1 = new Student(r, i);
    ob1.show();
    sc.close();
  }
}
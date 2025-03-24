package Unsolved_Problems;

import java.util.Scanner;

public class Employee1{
  
  public String empNo, empName, empDesig;

  Employee1(String enm, String eno, String eds){
    this.empName = enm;
    this.empNo = eno;
    this.empDesig = eds;
  }

  public void display(){
    System.out.println("Employee Name: "+this.empName);
    System.out.println("Employee Number: "+this.empNo);
    System.out.println("Employee Designation: "+this.empDesig);
  }

  public static void main(String[] args){
    String eno="", enm="", eds="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter employee name: ");
    enm = sc.nextLine();
    System.out.println("Enter employee number: ");
    eno = sc.next();
    System.out.println("Enter employee designation: ");
    sc.nextLine();
    eds = sc.nextLine();
    Employee1 ob1 = new Employee1(enm, eno, eds);
    ob1.display();
    sc.close();
  }
}

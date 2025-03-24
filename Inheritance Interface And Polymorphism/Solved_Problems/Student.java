import java.util.Scanner;

public class Student{

  public String name, dob;
  public int roll;

  public void inputdata(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    this.name = sc.nextLine();
    System.out.println("Enter date of birth in the format dd/mm/yyyy: ");
    this.dob = sc.nextLine();
    System.out.println("Enter roll number: ");
    this.roll = sc.nextInt();
  }

  public void printdata(){
    System.out.println("Name: "+this.name);
    System.out.println("Date of birth: "+this.dob);
    System.out.println("Roll number: "+this.roll);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Student ob1 = new Student();
    ob1.inputdata();
    ob1.printdata();

    System.out.println("\nFor Object 2: ");
    Student ob2 = new Student();
    ob2.inputdata();
    ob2.printdata();
  }
}
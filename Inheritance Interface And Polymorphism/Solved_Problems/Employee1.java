import java.util.Scanner;

public class Employee1{

  public String name;
  int empcode, basic;

  public void getdata(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter name: ");
    this.name = sc.nextLine();
    System.out.println("Enter employee code: ");
    this.empcode = sc.nextInt();
    System.out.println("Enter basic salary: ");
    this.basic = sc.nextInt();
  }

  public void showdata(){
    System.out.println("Name: "+this.name);
    System.out.println("Employee Code: "+this.empcode);
    System.out.println("Basic Salary: Rs."+this.basic);
    //System.out.println("Name"+"\t\t"+"Employee Code"+"\t\t"+"Basic Salary");
    //System.out.println(this.name+"\t"+this.empcode+"\t\t\t"+this.basic);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Employee1 ob1 = new Employee1();
    ob1.getdata();
    ob1.showdata();
  }
}
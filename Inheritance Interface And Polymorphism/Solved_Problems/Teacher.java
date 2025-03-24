import java.util.Scanner;

public class Teacher{

  public String name[], dob[], doj[];
  public int n;

  public void getdata(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter total number of teachers: ");
    this.n = sc.nextInt();
    this.name = new String[this.n];
    this.dob = new String[this.n];
    this.doj = new String[this.n];
    System.out.println("\nName"+"\t"+"Date Of Birth"+"\t"+"Date Of Joining");
    for(int i=0;i<this.n;i++){
      System.out.println("\nTeacher "+(i+1)+":");
      System.out.println("Enter Name: ");
      sc.nextLine();
      this.name[i] = sc.nextLine();
      System.out.println("Enter Date Of Birth: ");
      this.dob[i] = sc.next();
      System.out.println("Enter Date Of Joining: ");
      this.doj[i] = sc.next();
    }
  }

  public void show_getdata(){
    System.out.println("\nName"+"\t\t"+"Date Of Birth"+"\t"+"Date Of Joining");
    for(int i=0;i<this.n;i++){
      System.out.println(this.name[i]+"\t"+this.dob[i]+"\t"+this.doj[i]);
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Teacher ob1 = new Teacher();
    ob1.getdata();  
    ob1.show_getdata();
  }
}

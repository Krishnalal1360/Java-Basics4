import java.util.Scanner;

public class Record{

  public String name[];
  public int rnk[];

  Record(){
    this.name = new String[0];
    this.rnk = new int[0];
  }

  public void readvalues(){
    int n=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    n = sc.nextInt();
    this.name = new String[n];
    this.rnk = new int[n];
    System.out.println("Enter the name and rank of students.");
    for(int i=0;i<n;i++){
      System.out.println("Student "+(i+1)+":");
      System.out.print("Enter name: ");
      sc.nextLine();
      this.name[i] = sc.nextLine();
      System.out.println();
      System.out.print("Enter rank: ");
      this.rnk[i] = sc.nextInt();
      System.out.println();
    }
  }

  public void display(){
    System.out.println("Students name and rank.");
    for(int i=0;i<this.name.length;i++){
      System.out.println(this.name[i]+"\t"+this.rnk[i]);
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Record ob1 = new Record();
    ob1.readvalues();
    ob1.display();
  }
}
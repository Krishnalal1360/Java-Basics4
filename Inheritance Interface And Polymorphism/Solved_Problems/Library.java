import java.util.Scanner;

public class Library{

  public String name, author;
  public float p;

  Library(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the book: ");
    this.name = sc.nextLine();
    System.out.println("Enter the name of the author: ");
    this.author = sc.nextLine();
    System.out.println("Enter the price of the book: ");
    this.p = sc.nextFloat();
  }

  public void show(){
    System.out.println("Name of the book: "+this.name);
    System.out.println("Name of the author: "+this.author);
    System.out.println("Price of the book: Rs."+this.p);
  }

  public static void main(String[] args) {
    System.out.println("\nFor Object 1: ");
    Library ob1 = new Library();
    ob1.show();
  }
}
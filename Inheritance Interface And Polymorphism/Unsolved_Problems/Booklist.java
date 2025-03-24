package Unsolved_Problems;

import java.util.Scanner;

public class Booklist extends Author{

  public long bookno;
  public String bookname;
  public float price;
  public int edition;

  Booklist(){
    String n="";
    long an=0l;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name: ");
    n = sc.nextLine();
    System.out.println("Enter author number: ");
    an = sc.nextLong();
    super(an, n);
    System.out.println("Enter book number: ");
    this.bookno = sc.nextLong();
    System.out.println("Enter book name: ");
    sc.nextLine();
    this.bookname = sc.nextLine();
    System.out.println("Enter book price: ");
    this.price = sc.nextFloat();
    System.out.println("Enter book edition: ");
    this.edition = sc.nextInt();
  }

  public void show(){
    super.show();
    System.out.println("Book number: "+this.bookno);
    System.out.println("Book name: "+this.bookname);
    System.out.println("Book price: Rs."+this.price);
    System.out.println("Book edition: "+this.edition);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Booklist ob1 = new Booklist();
    ob1.show();
  }
}

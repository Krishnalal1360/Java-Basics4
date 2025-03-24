package Unsolved_Problems;

import java.util.Scanner;

public class Author{
  
  public String name;
  public long authorno;

  Author(long an, String n){
    this.name = n;
    this.authorno = an;
  }

  public void show(){
    System.out.println("Name: "+this.name);
    System.out.println("Author number: "+this.authorno);
  }

  public static void main(String[] args){
    String n="";
    long an=0l;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter name: ");
    n = sc.nextLine();
    System.out.println("Enter author number: ");
    an = sc.nextLong();
    Author ob1 = new Author(an, n);
    ob1.show();
    sc.close();
  }
}

import java.util.Scanner;

public class Sentence{

  protected String str;

  Sentence(){
    this.str = "";
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a sentence: ");
    this.str = sc.nextLine();
  }

  public void display(){
    System.out.println("\nSentence: \n"+this.str);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Sentence ob1 = new Sentence();
    ob1.accept();
    ob1.display();
  }
}

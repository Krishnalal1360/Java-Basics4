import java.util.Scanner;
import java.lang.String;

public class Principal extends Teacher{

  public void sortdata(){
    this.getdata();
    this.show_getdata();
    String temp="", temp1="", temp2="";
    for(int i=0;i<this.n-1;i++){
      temp = this.name[i];
      temp1 = this.dob[i];
      temp2 = this.doj[i];
      for(int j=i+1;j<this.n;j++){
        if((this.name[j].compareTo(this.name[i])) < 0){
          this.name[i] = this.name[j];
          this.name[j] = temp;
          temp = this.name[i];

          this.dob[i] = this.dob[j];
          this.dob[j] = temp1;
          temp1 = this.dob[i];

          this.doj[i] = this.doj[j];
          this.doj[j] = temp2;
          temp2 = this.doj[i];
        }
      }
    }
  }

  public void display(){
    System.out.println("\nAfter sorting Teacher names based on alphabetical order: ");
    System.out.println("\nName"+"\t\t"+"Date Of Birth"+"\t"+"Date Of Joining");
    for(int i=0;i<this.n;i++){
      System.out.println(this.name[i]+"\t"+this.dob[i]+"\t"+this.doj[i]);
    }
  }

  public void searchdata(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the teacher name to be searched: ");
    String tn = sc.nextLine();
    for(int i=0;i<this.n;i++){
      if(this.name[i].equals(tn)){
        System.out.println("\nTeacher "+this.name[i]+" is found at index "+i);
        break;
      }
      if(i == this.n-1){
        System.out.println("\nTeacher "+tn+" is not found!");
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("\nFor Object 1: ");
    Principal ob1 = new Principal();
    ob1.sortdata();
    ob1.display();  
    ob1.searchdata();
  }
}

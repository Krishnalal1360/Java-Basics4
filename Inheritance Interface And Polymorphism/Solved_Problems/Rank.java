public class Rank extends Record{

  public int index;

  Rank(){
    super();
    this.index = 0;
  }

  public void sort(){
    String temp1="";
    int temp2 = 0;
    for(int i=0;i<this.name.length-1;i++){
      temp1 = this.name[i];
      temp2 = this.rnk[i];
      for(int j=i+1;j<this.name.length;j++){
        if(this.rnk[j] < this.rnk[i]){
          this.name[i] = this.name[j];
          this.name[j] = temp1;
          temp1 = this.name[i];

          this.rnk[i] = this.rnk[j];
          this.rnk[j] = temp2;
          temp2 = this.rnk[i];
        }
      }
    }
  }

  public void highest(){
    super.readvalues();
    this.sort();
    this.index = this.rnk[0];
  }

  public void display(){
    super.display();
    System.out.println("\nStudent "+this.name[0]+" has got the highest rank of "+this.index+".");
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Rank ob1 = new Rank();
    ob1.highest();
    ob1.display();
  }
}
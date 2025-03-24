public class Bestfour extends ISC_Scores{

  public int tp;

  public void bestsubjects(){
    int f=0;
    for(int i=0;i<this.ar.length;i++){
      for(int j=0;j<this.ar[i].length;j++){
        if(j == 1){
          this.tp = this.tp+this.point(this.ar[i][j]);
        }
      }
    }
    System.out.println("\nTotal points: "+this.tp);
    System.out.println("\nBest Four Subjects: ");
    for(int i=0;i<4;i++){
      for(int j=0;j<2;j++){
        if(f == 0){
          System.out.print((int)(this.ar[i][j])+"\t\t");
          f = 1;
          continue;
        }
        if(f == 1){
          System.out.print(this.ar[i][j]+"\t\t");
          f = 0;
          continue;
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Bestfour ob1 = new Bestfour();
    ob1.iscscores();
    ob1.display();
    ob1.sort();
    ob1.display(); 
    ob1.bestsubjects();
  }
}
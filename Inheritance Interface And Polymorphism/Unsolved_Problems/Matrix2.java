package Unsolved_Problems;

public class Matrix2 extends Matrix1{

  public int c1[][];

  Matrix2(){
    super();
    super.readLimit();
    this.c1 = new int[this.m][this.c];
    super.input_a();
    super.input_b();
    super.showmats();
  }

  public void product(){
    if(this.n == this.r){
      for(int i=0;i<this.m;i++){
        for(int k=0;k<this.c;k++){
          for(int j=0;j<this.n;j++){
            this.c1[i][k] += this.a[i][j]*this.b[j][k];
          }
        }
      }
    }
  }

  public void showmatrix(){
    if(this.n == this.r){
      System.out.println("Product of Matrix a[][] and b[][]");
      for(int i=0;i<this.m;i++){
        for(int j=0;j<this.c;j++){
          System.out.print(this.c1[i][j]+"\t");
        }
        System.out.println();
      }
    }else{
      System.out.println("Multiplication is not possible because n is not equal to r.");
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Matrix2 ob1 = new Matrix2();
    ob1.product();
    ob1.showmatrix();
  }
}

import java.lang.String;
import java.lang.Character;

public class Duplicate extends Sentence{

  public int p;
  public String nstr;

  Duplicate(){
    super();
    this.p = 0;
    this.nstr = "";
  }

  public void remove(){
    String st="";
    char c='\u0000', c1='\u0000';
    super.accept();
    this.str = this.str.concat(" ");
    this.p = this.str.length();
    for(int i=0;i<this.p;i++){
      c = this.str.charAt(i);
      if(Character.isWhitespace(c) == false){
        st = st.concat(Character.toString(c));
      }else{
        for(int j=0;j<st.length()-1;j++){
          c = st.charAt(j);
          c1 = st.charAt(j+1);
          if(c != c1){
            this.nstr = this.nstr.concat(Character.toString(c));  
          }else{
            continue;
          }
        }
        this.nstr = this.nstr.concat(Character.toString(st.charAt(st.length()-1)));
        this.nstr = this.nstr.concat(" ");
        st = "";
      }
    }
    super.display();
    System.out.println("\nModified String: \n"+this.nstr);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Duplicate ob1 = new Duplicate();
    ob1.remove();
  }
}
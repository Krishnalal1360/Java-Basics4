import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
 
public class StringIndex{
  public static void main(String[] args){
    char c='\u0000', c1='\u0000';
    String st="", st1="", st2="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    st = sc.nextLine();
    st = st.concat(" ");
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == false){
        st1 = st1.concat(Character.toString(c));
      }else{
        for(int j=0;j<st1.length()-1;j++){
          c = st1.charAt(j);
          c1 = st1.charAt(j+1);
          if(c != c1){
            st2 = st2.concat(Character.toString(c));  
          }else{
            continue;
          }
        }
        st2 = st2.concat(Character.toString(st1.charAt(st1.length()-1)));
        st2 = st2.concat(" ");
        st1 = "";
      }
    }
    st2 = st2.trim();
    System.out.println("\nOriginal String: \n"+st);
    System.out.println("\nNew String: \n"+st2);
    sc.close();
  }
}
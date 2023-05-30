import java.util.Scanner;
public class Quiz7_1{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your message ; ");
    String mss = sn.nextLine();
    System.out.print("Totsal number of T&Y in this message is : "+countTY(mss));
  }
  public static int countTY(String str){
    int count = 0;
    for(int i = 0;i<str.length();i++){
      if(str.charAt(i) == 't' && str.charAt(i+1) == 'y' || str.charAt(i) == 'y' && str.charAt(i+1) == 't' 
           || str.charAt(i) == 'T' && str.charAt(i+1) == 'Y' || str.charAt(i) == 'Y' && str.charAt(i+1) == 'T'){
        count += 1;
      }
    }
    return count;
  }
}
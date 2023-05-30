import java.util.Scanner;
public class Quiz7_2{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    //char test = '9';
    System.out.print("Enter your fav number : ");
    String fav = sn.nextLine();
    char favch = fav.charAt(0);
    System.out.print("Enter your message : ");
    String mss = sn.nextLine();
    countFavoriteDigits(favch,mss);
  }
  public static void countFavoriteDigits(char ch,String str){
    int count = 0;
    int num = 0;
    for(int i = 0;i<str.length();i++){
      char c = str.charAt(i);
      if(c >= '0' && c <= '9'){
        count += 1;
        if(c == ch){
          num += 1;
        }
      }    
    }
    System.out.println("Total numbers in this message are : "+count);
    System.out.print("Total your favorite number in this message is : "+num);
  }
}
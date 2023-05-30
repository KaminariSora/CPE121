import java.util.Scanner;
public class Quiz7_2_1{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your fav number : ");
    char fav = sn.next().charAt(0);
    System.out.print("Enter your message : ");
    String mss = sn.nextLine();
    System.out.print(mss);
    //countFavoriteDigits(fav,mss);
  }
}
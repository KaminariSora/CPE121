import java.util.Scanner;
public class Quiz02_1{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter A-Z : ");
    char input = sn.next().charAt(0);
    switch(input){
      case 'C' : System.out.println("This Character is in the Abbrevian of Computer Engineering SWU.");
      break;
      case 'P' : System.out.println("This Character is in the Abbrevian of Computer Engineering SWU.");
      break;
      case 'E' : System.out.println("This Character is in the Abbrevian of Computer Engineering SWU.");
      break;
      case 'S' : System.out.println("This Character is in the Abbrevian of Computer Engineering SWU.");
      break;
      case 'W' : System.out.println("This Character is in the Abbrevian of Computer Engineering SWU.");
      break;
      case 'U' : System.out.println("This Character is in the Abbrevian of Computer Engineering SWU.");
      break;
      default : System.out.println("This Character is not in the Abbrevian of Computer Engineering SWU.");
    }
    sn.close();
  }
}
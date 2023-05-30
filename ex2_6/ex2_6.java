import java.util.Scanner;
public class ex2_6{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a year : ");
    int year = sn.nextInt();
    int zodiac = year%12;
    switch(zodiac){
      case 0 : System.out.print("monkey");
      break;
      case 1 : System.out.print("rooster");
      break;
      case 2 : System.out.print("dog");
      break;
      case 3 : System.out.print("pig");
      break;
      case 4 : System.out.print("rat");
      break;
      case 5 : System.out.print("ox");
      break;
      case 6 : System.out.print("tiger");
      break;
      case 7 : System.out.print("rabbit");
      break;
      case 8 : System.out.print("dragon");
      break;
      case 9 : System.out.print("snake");
      break;
      case 10 : System.out.print("horse");
      break;
      case 11 : System.out.print("sheep");
      break;
    }
    sn.close();
  }
}
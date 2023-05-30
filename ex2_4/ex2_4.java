import java.util.Random;
import java.util.Scanner;
public class ex2_4{
  public static void main(String []args){
    Random rn = new Random();
    Scanner sn = new Scanner(System.in);
    int RandomNumber = rn.nextInt(6)+1;
    System.out.print("Guess  the roll [1-6] :");
    int guess = sn.nextInt();
    if(RandomNumber == guess){
      System.out.print("Your guess is correct.");
    }else{
      System.out.print("Your guess is incorrect.");
    }
    System.out.print("Answer is "+RandomNumber);
    sn.close();
  }
}
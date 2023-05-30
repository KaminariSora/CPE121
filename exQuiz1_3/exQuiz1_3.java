import java.util.Scanner;
public class exQuiz1_3{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter a decimal value(0000-9999) :");
    int decimal = sn.nextInt();
    System.out.print("Binary value in each digit = ");
    for(int i =3;i<=0;i--){
      int mainValue = decimal%(Math.pow(10,i));
    }
  }
}
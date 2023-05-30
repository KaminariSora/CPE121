import java.util.Scanner;
import java.util.Random;
class ex6_5{
  
  public static void main(String[]args){
    int[] number;
  number = new int[5];
    int keb;
  
  Random ra = new Random();
  Scanner in = new Scanner(System.in);
  
    for(int i = 0;i<5;i++){
      System.out.print("Read a number: ");
      number[i] = in.nextInt();
    }
    for(int i = 0 ;i<5;i++){
      int j = ra.nextInt(5);
      keb = number[i];
      number[i] = number[j];
      number[j] = keb; 
  }
    for(int i = 0;i<5;i++){
      System.out.println(number[i]);
}
  }
}
    
import java.util.Scanner;
public class Quiz8_1{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    try{
      int i = 0;
      int y = 65;
      System.out.println("Program for computing the equation of a staight-line result");
      System.out.print("Enter c value : ");
      int c = sn.nextInt();
      System.out.print("Enter m value : ");
      int m = sn.nextInt();
      System.out.print("Enter the total numbers of Y : ");
      int Y = sn.nextInt();
      int arr[] = new int[Y];
      while(i<25){
        arr[i] = (y - c)/m;
        System.out.print(arr[i]+" ");
        i++;
        y++;
      }
    }catch(ArithmeticException e1){
      System.out.println("Program has some ploblem with : "+e1);
    }catch(ArrayIndexOutOfBoundsException e2){
      System.out.println("Program has some ploblem with : "+e2);
    }catch(Exception e3){
      System.out.println("Program has some ploblem with : "+e3);
    }
  }
}
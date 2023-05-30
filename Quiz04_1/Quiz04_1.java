import java.util.Scanner;
public class Quiz04_1{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter value of width : ");
    double w = sn.nextDouble();
    System.out.print("Enter value of length : ");
    double l = sn.nextDouble();
    System.out.print("Enter inner depth : ");
    double d = sn.nextDouble();
    System.out.print("Enter outer depth : ");
    double o = sn.nextDouble();
    double result = rectangleBoxVolumeDif(w,l,o,d);
    System.out.print("The different of 2 Rectangle Boxes is : "+result);
  }
  
   public static double rectangleBoxVolumeDif(double length,double width,double deptOut,double depthIn){
      double small = length*width*depthIn;
      double big = length*width*deptOut;
      double result = big-small;
      return result;
  }
}
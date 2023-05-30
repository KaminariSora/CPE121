import java.util.Scanner;
public class ex2_7{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates : "); 
    Double point1 = sn.nextDouble();
    Double point2 = sn.nextDouble();
    Double distance = Math.sqrt(Math.pow(point1-0,2)+Math.pow(point2-0,2));
    if(distance <= 10){
      System.out.printf("Point (%f,%f) is in the circle.",point1,point2);
    }else{
      System.out.printf("Point (%f,%f) is not in the circle.",point1,point2);
    }
    sn.close();
  }
}
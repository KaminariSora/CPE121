import java.util.Scanner;
public class Quiz02_2{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter r1's center x,y,width,height : ");
    int x1 = sn.nextInt();
    int y1 = sn.nextInt();
    int width1 = sn.nextInt();
    int height1 = sn.nextInt();
    int area1 = width1*height1;

    System.out.print("Enter r2's center x,y,width,height : ");
    int x2 = sn.nextInt();
    int y2 = sn.nextInt();
    int width2 = sn.nextInt();
    int height2 = sn.nextInt();
    
    int area2 = width2*height2;
    int R1x = width1/2;
    int R1y = height1/2;
    int R2x = width2/2;
    int R2y = height2/2;
    if(x2-x1<=R1x){
      if(y2-y1<=R1y || x2-x1>=R1x){
        System.out.print("r2 is overlaps r1.");
      }else if(R1x >= R2x && R1y >= R2y){
        System.out.print("r2 is inside r1.");
      }
    }else{
      System.out.print("r2 does not overlap r1.");
    }
        sn.close();
   }
  }

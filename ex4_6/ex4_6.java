import java.util.Scanner;
public class ex4_6{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        method mt = new method();
        System.out.print("Hello welcome to my progarm\n");
        System.out.print("choose (1)Integer mode or (2)Double mode : ");
        int choice = sn.nextInt();
        switch(choice){
            case 1 : 
                System.out.print("Input x1,y1 : ");
                int x1 = sn.nextInt();
                int y1 = sn.nextInt();
                System.out.print("Input x2,y2 : ");
                int x2 = sn.nextInt();
                int y2 = sn.nextInt();
                int result = mt.distance(x1,y1,x2,y2);
                System.out.print("The distance value of point ("+x1+","+y1+") and point ("+x2+","+y2+") is ");
                System.out.print(result);
                break;
            case 2 :
                System.out.print("Input x1,y1 : ");
                double X1 = sn.nextDouble();
                double Y1 = sn.nextDouble();
                System.out.print("Input x1,y2 : ");
                double X2 = sn.nextDouble();
                double Y2 = sn.nextDouble();
                double RESULT = mt.distance(X1,Y1,X2,Y2);
                System.out.print("The distance value of point ("+X1+","+Y1+") and point ("+X2+","+Y2+") is ");
                System.out.print(RESULT);
                break;
            default : System.out.print("Error,Please try again!!!");
        }
        
        
        sn.close();
    }
}
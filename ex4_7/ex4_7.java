import java.util.Scanner;
public class ex4_7{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Select data typeof all number (1)int (2)double : ");
        int choice = sn.nextInt();
        System.out.print("Enter five numbers : ");
        switch(choice){
            case 1 :
                int i1 = sn.nextInt();
                int i2 = sn.nextInt();
                int i3 = sn.nextInt();
                int i4 = sn.nextInt();
                int i5 = sn.nextInt();
                int result = Method.average(i1,i2,i3,i4,i5);
                System.out.print("Average value : "+result);
                break;
            case 2 : 
                double I1 = sn.nextDouble();
                double I2 = sn.nextDouble();
                double I3 = sn.nextDouble();
                double I4 = sn.nextDouble();
                double I5 = sn.nextDouble();
                double RESULT = Method.average(I1,I2,I3,I4,I5);
                System.out.print("Average value : "+RESULT);
                break;
            default : 
        }
        sn.close();
    }
}
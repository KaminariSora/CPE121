import java.util.Scanner;
public class ex4_2{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Input number of 'n' and 'side' : ");
        int n = sn.nextInt();
        double s = sn.nextDouble();
        Calculate.Cal(n,s);
        sn.close();
    }
}
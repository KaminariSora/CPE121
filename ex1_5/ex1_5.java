import java.util.Scanner;
class ex1_5{
    public static void main(String []args){
        Double F;
        Double C;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input Farenheit:");
        F = sn.nextDouble();
        C = (5/9)*(F-32);
        System.out.print("Celsius:"+C);
    }
}
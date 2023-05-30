import java.util.Scanner;
public class ex4_1{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        check C = new check();
        System.out.print("Enter 3 numbers : ");
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        C.A(a,b,c);
        sn.close();
    }
}
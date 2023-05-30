import java.util.Scanner;
public class ex4_5{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int integer = sn.nextInt();
        int result = method.reverse(integer);
        System.out.print("The reverse order are "+result);
        sn.close();
    }
}
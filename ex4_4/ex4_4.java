import java.util.Scanner;
public class ex4_4{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sn.nextInt();
        int result = method.sumDigits(num);
        System.out.printf("The sum of digits for %d is ",num);
        System.out.print(result);
        sn.close();
    }
}
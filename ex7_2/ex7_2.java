import java.util.Scanner;
public class ex7_2{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String ms = sn.nextLine();
        System.out.print("Your message is : ");
        hello(ms);
        sn.close();
    }

    public static void hello(String ms){
        System.out.print(ms.substring(2,ms.length())+ms.charAt(0)+ms.charAt(1));
    }
}
import java.util.Scanner;
public class ex7_3{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String ms = sn.nextLine();
        String str = ms.substring(0,ms.length()-3);
        System.out.print(str);
        beg(ms);
        sn.close();
    }
    public static void beg(String ms){
        String str = ms.substring(ms.length()-3,ms.length());
        System.out.print(str.toUpperCase());
    }
}
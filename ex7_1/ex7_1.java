import java.util.Scanner;
public class ex7_1{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String ms = sn.nextLine();
        System.out.print("Your message is : "+check(ms));
        sn.close();
    }

    public static String check(String ms){
        if(ms.charAt(1) == 'e'){
            return "true" ;
        }else{
            return "false" ;
        }
        
    }
}
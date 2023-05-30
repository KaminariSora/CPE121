import java.util.Scanner;
public class ex7_4{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String ms = sn.nextLine();
        System.out.print(sumNumbers(ms));
        sn.close();
    }
    public static int sumNumbers(String str){
        int sum = 0;
        int num = 0;
        boolean hash = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
                hash = true;
            }else if (hash) {
                sum += num;
                num = 0;
                hash = false;   
            }    
        }

        if (hash == true) {
            sum += num;
        }

        return sum;
    }
}
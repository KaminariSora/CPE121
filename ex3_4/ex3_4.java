import javax.swing.JOptionPane;
import java.util.Scanner;
public class ex3_4{
    public static void main(String []args){
        int n;
        double a,x,result;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a,x,n >>> ");
        a = sn.nextDouble();
        x = sn.nextDouble();
        n = sn.nextInt();
        switch(n){
            case 0 : 
            result = a*1;
            JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+"is "+result);
            break;
            case 1 :
            result = a*x;
            JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+"is "+result);
            break;
            case 2 :
            result = a*x*x;
            JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+"is "+result);
            break;
            case 3 :
            result = a*x*x*x;
            JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+"is "+result);
            break;
            case 4 :
            result = a*x*x*x*x;
            JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+"is "+result);
            break;
            case 5 :
            result = a*x*x*x*x*x;
            JOptionPane.showMessageDialog(null,"ax^n where a = "+a+",x = "+x+",n = "+n+"is "+result);
            break;
            default : JOptionPane.showMessageDialog(null,"Out of range");
        }
        sn.close();
    }
}
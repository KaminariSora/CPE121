import java.util.Scanner;
import javax.swing.JOptionPane;
public class exQuiz1_2{
  public static void main(String []args){
    int binary[] = new int[8];
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter a binary value in the format b7b6b5b4b3b2b1b0 : ");
    for(int i = 0;i<=7;i++){
      binary[i] = sn.nextInt();
    }
    double H1 = (binary[7]*Math.pow(2,0))+(binary[6]*Math.pow(2,1))+(binary[5]*Math.pow(2,2))+(binary[4]*Math.pow(2,3));
    double H2 = (binary[3]*Math.pow(2,0))+(binary[2]*Math.pow(2,1))+(binary[1]*Math.pow(2,2))+(binary[0]*Math.pow(2,3));
    double Hex = H1*H2;
    JOptionPane.showMessageDialog(null,"Hexadecimal values = "+Hex);
    sn.close();
  }
}
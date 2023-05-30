import java.util.Scanner;
import javax.swing.JOptionPane;
public class exQuiz1_1{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter amount of water in kilogram : ");
    double mass = sn.nextDouble();
    System.out.print("Enter the initial temperature and final temperature : ");
    double first = sn.nextDouble();
    double last = sn.nextDouble();
    double q = mass * 4184 * (last-first);
    JOptionPane.showMessageDialog(null,"The energy needed is "+q);
    sn.close();
  }
}
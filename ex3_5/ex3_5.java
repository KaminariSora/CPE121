import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex3_5{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        String n = JOptionPane.showInputDialog(null,"Enter the number of total students :");
        String score1 = JOptionPane.showInputDialog(null,"Enter score of student No1 :");
        String score2 = JOptionPane.showInputDialog(null,"Enter score of student No2 :");
        String score3 = JOptionPane.showInputDialog(null,"Enter score of student No3 :");
        Double n_1 = Double.parseDouble(n);
        Double score1_1 = Double.parseDouble(score1);
        Double score2_1 = Double.parseDouble(score2);
        Double score3_1 = Double.parseDouble(score3);
        double mean = (score1_1+score2_1+score3_1)/n_1;
        double x01 = Math.pow(score1_1-mean,2);
        double x02 = Math.pow(score2_1-mean,2);
        double x03 = Math.pow(score3_1-mean,2);
        double SUM = x01 + x02 + x03; 
        double SD = Math.sqrt(SUM/n_1);
        JOptionPane.showMessageDialog(null,"Mean value of student score :"+mean);
        JOptionPane.showMessageDialog(null,"SD value of student score :"+SD);
        sn.close();
    }
}
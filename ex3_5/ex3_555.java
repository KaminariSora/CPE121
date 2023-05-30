import javax.swing.JOptionPane;
public class ex3_555{
    public static void main(String []args){
      String m = JOptionPane.showInputDialog(null,"Enter the number of total students :");
      Double n = Double.parseDouble(m);
      int i;
      double sum;
      sum = 0;
      for(i=0; i<n; i++){
        String s = JOptionPane.showInputDialog(null,"Enter score of students No :"+(i+1));
        Double score = Double.parseDouble(s);
        sum += score;
      }
      double mean = sum/n;
      JOptionPane.showMessageDialog(null,"Mean value of student score :"+mean);
    }
}
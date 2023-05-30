import javax.swing.JOptionPane;
public class Quiz01_2{
  public static void main(String []args){
    String side = JOptionPane.showInputDialog("Enter the side(s)");
    double s = Double.parseDouble(side);
    double area = 3*(1.71)*s*s;
    JOptionPane.showMessageDialog(null,"The area of hexagon is "+area);
  }
}
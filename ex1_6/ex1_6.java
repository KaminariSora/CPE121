import javax.swing.JOptionPane;
class ex1_6{
    public static void main(String []args){
        Double PI = 3.1415;
        Double area,volume;
        String radius = JOptionPane.showInputDialog(null,"Enter the radius of a cylinder");
        String lenght = JOptionPane.showInputDialog(null,"Enter the lenght of cylinder");
        double radius1 = Double.parseDouble(radius);
        double lenght1 = Double.parseDouble(lenght);
        area = radius1*radius1*PI;
        volume = area*lenght1;
        JOptionPane.showMessageDialog(null,"radius is "+area);
        JOptionPane.showMessageDialog(null,"lenght is "+volume);

    }
}
import javax.swing.JOptionPane;
class ex1_7{
    public static void main(String []args){
        Double kilograms;
        String pound = JOptionPane.showInputDialog("Enter number in pound");
        double pound1 = Double.parseDouble(pound);
        kilograms = pound1*0.454;
        JOptionPane.showMessageDialog(null,"It is "+kilograms+" kilograms");
    }
}
import javax.swing.*;
import java.awt.*;
public class ex9_4{
    public static void main(String []args){
        JFrame frame = new JFrame("ex9_4");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("c:\\Working/Photo/Anime/Screenshot_20221204-201235_Instagram.jpg");
        
        JLabel tx1 = new JLabel("first",remake(icon,40,40),SwingConstants.CENTER);
        tx1.setVerticalTextPosition(SwingConstants.BOTTOM);
        tx1.setHorizontalTextPosition(SwingConstants.CENTER);

        JLabel tx2 = new JLabel("second",remake(icon, 40, 40),SwingConstants.CENTER);
        tx2.setVerticalTextPosition(SwingConstants.CENTER);
        tx2.setHorizontalTextPosition(SwingConstants.RIGHT);

        JLabel tx3 = new JLabel("third",remake(icon, 40, 40),SwingConstants.CENTER);
        tx3.setVerticalTextPosition(SwingConstants.CENTER);
        tx3.setHorizontalTextPosition(SwingConstants.LEFT);

        JLabel tx4 = new JLabel("forth",remake(icon, 40, 40),SwingConstants.CENTER);
        tx4.setVerticalTextPosition(SwingConstants.TOP);
        tx4.setHorizontalTextPosition(SwingConstants.CENTER);

        panel.add(tx1);
        panel.add(tx2);
        panel.add(tx3);
        panel.add(tx4);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setVisible(true);
    }

    public static ImageIcon remake(ImageIcon icon,int w,int h){
        Image image = icon.getImage();
        Image remake = image.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(remake);
        return icon;
    }
}
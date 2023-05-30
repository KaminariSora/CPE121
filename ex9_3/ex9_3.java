import java.awt.*;
import javax.swing.*;
public class ex9_3{
    public static void main(String []args){
        JFrame frame = new JFrame("ex9_3");

        JPanel all = new JPanel();
        all.setLayout(new BorderLayout(2,3));

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));
        all.add(p1,BorderLayout.SOUTH);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));
        all.add(p2,BorderLayout.CENTER);

        frame.add(all);
        frame.setSize(300,120);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
import java.awt.*;
import javax.swing.*;
public class testing{
    public static void main(String []args){
        JFrame frame = new ControlCircle();
        frame.setTitle("ControlCircle");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}

class CirclePanel extends JPanel{
    private int radius = 5;
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(getWidth()/2 - radius,getHeight()/2 - radius,2 * radius,2 * radius);
    }
}
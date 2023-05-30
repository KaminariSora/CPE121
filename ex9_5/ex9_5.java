import java.awt.*;
import java.util.Random;

import javax.swing.*;
public class ex9_5{
    public static void main(String []args){
        JFrame frame = new JFrame("ex9_5");

        JLabel text = new JLabel();
        text.setLayout(new GridLayout(10,10));
        for(int i = 0;i<=9;i++){
            for(int j = 0;j<=9;j++){
                text.add(new JLabel(random()));
            }
        }
        frame.add(text);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public static String random(){
        Random rn = new Random();
        int Random = rn.nextInt(2);
        String result = Integer.toString(Random);
        return result;
    }
}
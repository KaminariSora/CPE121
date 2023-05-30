import java.awt.*;
import  javax.swing.*;

public class Q11_208_01 {
    public static void main(String[] args) {
        String AniList[] = {"Free Elective","104","120","121","140","193","194"};
        String type[] = {"Faculty of Science","Faculty of Social Sciences","Faculty of Physical Education","Faculty of Physical Therapy","Faculty of Phamacy","Faculty of Engineering","Faculty of Nurse"};
        JFrame frame = new JFrame("CPE 121 : Quiz 11 GUI");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));

        //Label
        JPanel zone1 = new JPanel();
        zone1.setLayout(new GridLayout(1,1));
        JLabel label = new JLabel("*** Please Login ***");
        label.setForeground(Color.red);
        panel.add(label);

        // input
        JPanel zone2 = new JPanel();
        zone2.setLayout(new GridLayout(2, 2));
        JTextField usr = new JTextField("", 10);
        JPasswordField pwd = new JPasswordField("", 10);
        zone2.add(new JLabel("username"));
        zone2.add(usr);
        zone2.add(new JLabel("password"));
        zone2.add(pwd);
        panel.add(zone2);

        //Button
        JPanel zone3 = new JPanel();
        zone3.setLayout(new FlowLayout());
        zone3.add(new JButton("Log in"));
        zone3.add(new JButton("Cancel"));
        panel.add(zone3);


        //CheckBox Radio
        JPanel zone4 = new JPanel();
        zone4.setLayout(new FlowLayout());
        zone4.add(new JCheckBox("Ongkharak"));
        zone4.add(new JCheckBox("Prasanmit"));
        zone4.add(new JRadioButton("CPE", true));
        zone4.add(new JRadioButton("SWU"));
        zone4.add(new JRadioButton("Oth"));
        panel.add(zone4);

        //List
        JPanel zone5 = new JPanel();
        zone5.setLayout(new GridLayout(1,2));
        zone5.add(new JComboBox<>(type));
        zone5.add(new JList<>(AniList));
        panel.add(zone5);

        JPanel zone6 = new JPanel();
        zone6.setLayout(new BorderLayout());
        zone6.add(new JTextField("Number to be displayed here"), BorderLayout.NORTH);
        JPanel subZone6 = new JPanel();
        subZone6.setLayout(new GridLayout(4,4));
        subZone6.add(new JButton("1"));
        subZone6.add(new JButton("2"));
        subZone6.add(new JButton("3"));
        subZone6.add(new JButton("+"));
        subZone6.add(new JButton("4"));
        subZone6.add(new JButton("5"));
        subZone6.add(new JButton("6"));
        subZone6.add(new JButton("-"));
        subZone6.add(new JButton("7"));
        subZone6.add(new JButton("8"));
        subZone6.add(new JButton("9"));
        subZone6.add(new JButton("x"));
        subZone6.add(new JButton("."));
        subZone6.add(new JButton("0"));
        subZone6.add(new JButton("%"));
        subZone6.add(new JButton("/"));
        zone6.add(subZone6, BorderLayout.CENTER);
        zone6.add(new JButton("Enter"), BorderLayout.SOUTH);
        panel.add(zone6);

        frame.add(panel);
        frame.setSize(400, 800);
        frame.setLocationRelativeTo(null); // Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Display the frame
    }
}
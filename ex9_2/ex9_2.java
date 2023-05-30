import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ex9_2{
    public static void main(String []args){
        ImageIcon first = new ImageIcon("c:\\Working/Photo/Anime/Screenshot_20221231-214442_Instagram.jpg");
        ImageIcon second = new ImageIcon("c:\\Working/Photo/Anime/Screenshot_20230114-174039_Instagram.jpg");
        ImageIcon third = new ImageIcon("c:\\Working/Photo/Anime/Screenshot_20230114-174039_Instagram.jpg");
        ImageIcon forth = new ImageIcon("c:\\Working/Photo/Anime/Screenshot_20230128-221650_Instagram.jpg");
        JFrame frame = new JFrame("ex9_2");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        
        JLabel st = new JLabel(reScale(first,400,320));// remake image
        st.setBorder(new LineBorder(Color.BLUE,2));
        JLabel nd = new JLabel(reScale(second,400,320));//ส่งค่า Icon height width เข้า method
        nd.setBorder(new LineBorder(Color.BLUE,2));
        JLabel rd = new JLabel(third);//ไม่ remake
        rd.setBorder(new LineBorder(Color.BLUE,2));
        JLabel th = new JLabel(forth);//ไม่ remake
        th.setBorder(new LineBorder(Color.BLUE,2));
        panel.add(st);
        panel.add(nd);
        panel.add(rd);
        panel.add(th);

        frame.add(panel);
        frame.setSize(1280,1600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static ImageIcon reScale(ImageIcon imageIcon,int h,int w){
        Image image = imageIcon.getImage();//เปลี่ยน Icon เป็น Image
        Image remake = image.getScaledInstance(h, w, java.awt.Image.SCALE_SMOOTH);//ปรับขนาด image
        imageIcon = new ImageIcon(remake);//เปลี่ยน Imange เป็น Icon
        return imageIcon;//ส่ง Iconกลับ
    }
}
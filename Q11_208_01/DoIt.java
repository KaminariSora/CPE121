import java.awt.*;
import javax.swing.*;
class DoIt{
    public static void main(String []args){
        JFrame frame = new JFrame("CPE121 : Practice");
        String type[] = {"Faculty of Science","Faculty of Social Science","Faculty of Physical Education","Faculty of Physical Therapy","Faculty of Pharmacy","Faculty of Engineering","Faculty of Nurse"};
        String AniList[] = {"Free Elective","104","120","121","140","193","194"};

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,1));//จัดวางตำแหน่งตามตารางของ panel
        //zone1
        JPanel zone1 = new JPanel();//สร้างObject zone1
        zone1.setLayout(new GridLayout(1,1));//จัดวางตำแหน่งตารางของ zone1
        JLabel label = new JLabel("***please login***");
        label.setForeground(Color.red);
        panel.add(label);//จับ Object label มา add ใน panel

        JPanel zone2 = new JPanel();
        zone2.setLayout(new GridLayout(2,2));
        JTextField user = new JTextField("",10);
        JPasswordField password = new JPasswordField("",10);
        zone2.add(new JLabel("username"));//ใส่ username ที่ zone2
        zone2.add(user);//แสดง TextField ที่ zone2
        zone2.add(new JLabel("password"));//อย่าไปใส่ผิดเป็น panel ล่ะ
        zone2.add(password);//ใส่เป็น panel จะได้ขนาดที่ไม่ถูกต้องเลย
        panel.add(zone2);//อย่าลืม add zone2 ลงใน panel

        JPanel zone3 = new JPanel();
        zone3.setLayout(new FlowLayout());//FlowLayout คือ การจัดวางตำแหน่งแบบต่อกัน ซ้ายไปขวา บนลงล่าง
        zone3.add(new JButton("Log in"));
        zone3.add(new JButton("Cancel"));
        panel.add(zone3);//เพิ่ม zone3 ลงใน panel ใหญ่ที่สร้างไว้

        JPanel zone4 = new JPanel();
        zone4.setLayout(new FlowLayout());//จัดวางตำแหน่งจากซ้ายไปขวา บนลงล่าง
        zone4.add(new JCheckBox("Ongkarak"));// CheckBox ปุ่มเหลี่ยม
        zone4.add(new JCheckBox("Prasanmit"));
        zone4.add(new JRadioButton("CPE",true));//ตั้งค่าให้ติ้กเลือกเลย
        zone4.add(new JRadioButton("SWU"));// CheckBox ปุ่มกลม
        zone4.add(new JRadioButton("Other"));
        panel.add(zone4);

        JPanel zone5 = new JPanel();
        zone5.setLayout(new GridLayout());
        zone5.add(new JComboBox<>(type));
        zone5.add(new JList<>(AniList));
        panel.add(zone5);

        JPanel zone6 = new JPanel();
        zone6.setLayout(new BorderLayout());
        zone6.add(new JTextField("Number to be displayed here"),BorderLayout.NORTH);//จัด Text ไว้ที่ North ของ zone6
        JPanel Szone6 = new JPanel();
        Szone6.setLayout(new GridLayout(4,4));
        Szone6.add(new JButton("1"));//จัด Szone6 เป็น JButton
        Szone6.add(new JButton("2"));
        Szone6.add(new JButton("3"));
        Szone6.add(new JButton("+"));
        Szone6.add(new JButton("4"));
        Szone6.add(new JButton("5"));
        Szone6.add(new JButton("6"));
        Szone6.add(new JButton("-"));
        Szone6.add(new JButton("7"));
        Szone6.add(new JButton("8"));
        Szone6.add(new JButton("9"));
        Szone6.add(new JButton("x"));
        Szone6.add(new JButton("."));
        Szone6.add(new JButton("0"));
        Szone6.add(new JButton("%"));
        Szone6.add(new JButton("/"));
        zone6.add(Szone6,BorderLayout.CENTER);//จัด Szone6 ไว้ที่ Center
        zone6.add(new JButton("Enter"),BorderLayout.SOUTH);//วาง JButton "Enter" ไว้ด้านล่างสุด
        panel.add(zone6);//ส่วนนี้อย่าลืม ไม่ add ไม่ได้

        frame.add(panel);//สร้าง panel
        frame.setSize(400,800);//กำหนดขนาด
        frame.setLocationRelativeTo(null);//ตรงกลาง
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//สร้างปุ่ม Exit
        frame.setVisible(true);//อย่าลืมตั้งอันนี้ให้มองเห็นด้วย
    }
}
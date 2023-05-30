
public class ex5_2{
    public static void main(String []args){
        double s1 = 10,s2 = 20,s3 = 30,s4 = 40,s5 = 50,s6 = 60;
        Triangle tri1 = new Triangle(s1,s2,s3);
        Triangle tri2 = new Triangle(s4,s5,s6);
        System.out.println("First Triangle (T1)");
        System.out.print("------------------------\n");
        tri1.Triangle();
        System.out.print("\n");
        System.out.println("Second Triangle (T2)");
        System.out.print("------------------------\n");
        tri2.Triangle();
    }
}
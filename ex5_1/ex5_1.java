public class ex5_1{ 
    public static void main(String []args){
        double r = 50;
        double R = 10;
        method m = new method(); 
        System.out.println("First Circle (C1)");
        System.out.println("----------------");
        m.Circle(r);
        System.out.println("Circle's Area : "+m.getArea());
        System.out.println("Circle's Volume : "+m.getVolume());
        System.out.println("Circle's Circumference : "+m.getCircumference());
        System.out.println("Second circle (C2)");
        System.out.println("----------------");
        m.Circle(R);
        System.out.println("Circle's Area : "+m.getArea());
        System.out.println("Circle's Volume : "+m.getVolume());
        System.out.println("Circle's Circumference : "+m.getCircumference());
    }   
}
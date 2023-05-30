public class Quiz05_1{
  public static void main(String []args){
    Cylinder C1 = new Cylinder();
    Cylinder C2 = new Cylinder(25.4);
    Cylinder C3 = new Cylinder(50.8,7.62);
    C1.printCylinder();
    C2.printCylinder();
    C3.printCylinder();
  }
}
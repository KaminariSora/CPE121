class Cylinder{
  public final double PI = 3.14;
  private double radius;
  private double height;
  public Cylinder(){
    this.radius = 5;
    this.height = 5;
  }
  public Cylinder(double r){
    this.radius = r;
  }
  public Cylinder(double r,double h){
    this.radius = r;
    this.height = h;
  }
  public double getCircleArea(){
    return PI*radius*radius;
  }
  public double getCylinderVolume(){
    return PI*radius*radius*height;
  }
  public double getSufaceAreaAllSides(){
    return (2*PI*radius*height)+(2*PI*radius*radius);
  }
  public double getRadius(){
    return radius;
  }
  public double getHeight(){
    return height;
  }
  public void printCylinder(){
    System.out.println("Circle Area = "+getCircleArea()+" cm2");
    System.out.println("Surface Area of All Sides = "+getSufaceAreaAllSides()+" cm3");
    System.out.println("Volume of Cylinder = "+getCylinderVolume()+" cm3");
  }
}
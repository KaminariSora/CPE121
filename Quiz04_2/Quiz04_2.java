public class Quiz04_2{
  public static void main(String []args){
    double B = 5.0;
    double H = 10.0;
    double L = 15.0;
    double R = 20.0;
    double tri = calVolume(B,H,L);
    double cylinder = calVolume(R,H);
    double prism = calVolume(R);
    System.out.println("sphere is "+tri);
    System.out.println("cylinder is "+cylinder);
    System.out.println("triangle prism is "+prism);
  }
  
  public static double calVolume(double b,double h,double l){
    double result = (b*h*l)/2;
    return result;
  }
  
  public static double calVolume(double r,double h){
    double result = Math.PI*r*h;
    return result;
  }
  
  public static double calVolume(double r){
    double result = (4/3)*Math.PI*r*r*r;
    return result;
  }
}
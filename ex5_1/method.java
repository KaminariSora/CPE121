public class method {
    public double PI = 3.14;
    private double r;
    public double Circle(double radius){
        this.r = radius;
        return r;
    }

    public double getArea(){
        return PI*r*r;
    }

    public double getVolume(){
        return 4/3*PI*r;
    }

    public double getCircumference(){
        return 2*PI*r;
    }
}

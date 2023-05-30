public class Triangle{
    private  double s1,s2,s3; 

    public void Triangle(){
        System.out.println("Triangle's area = "+getArea());
        System.out.println("Triangle's perimeter = "+getPerimeter());
    }

    public Triangle(double s1,double s2,double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1(){
        return s1;
    }

    public double getS2(){
        return s2;
    }

    public double getS3(){
        return s3;
    }

    public double getArea(){
        return Math.sqrt((s1+s2+s3)/2);
    }

    public double getPerimeter(){
        return s1+s2+s3;
    }
}
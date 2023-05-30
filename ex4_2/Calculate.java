class Calculate{
    public static double Cal(int n,double side){
        double area = (n*Math.pow(side,2))/4*Math.tan(Math.PI/n);
        System.out.print("The area is "+area);
        return area; 
    }
}
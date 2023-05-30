class method{
    public int distance(int x1,int y1,int x2,int y2){
        double D = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        int distance = Math.round((float)D);
        return distance;
    }

    public double distance(double x1,double y1,double x2,double y2){
        double D = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return D;
    }
}
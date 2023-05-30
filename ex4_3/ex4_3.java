public class ex4_3{
    public static void main(String []args){
        int x = 1;
        double result;
        while(x<=1000){
            //System.out.println(x);
            x += 100;
            result = Calculater.m(x);
            System.out.println(result);
        }
        
    }
}
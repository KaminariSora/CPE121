public class Calculater{
    public static double m(int i){
        double j;
        double result;
        while(i<1000){
            result = Math.pow(-1,i-1)/(2*i-1);
            i += 100;
            return result;
        }
        return 0;
   }
}
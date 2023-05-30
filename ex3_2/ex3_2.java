public class ex3_2{
    public static void main(String []args){
        int i,km=20;
        double km_m,m_km;
        System.out.print("Miles\tKilometers\t|\tKilometers\tMiles\n");
        for(i = 1;i<=10;i++){
            m_km = (i)*0.621;
            km_m = km*0.621;
            System.out.printf("%d\t%.3f\t|\t%d\t%.3f\n",i,m_km,km,km_m);
            km += 5;
        }
    }
}
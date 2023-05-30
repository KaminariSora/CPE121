import java.util.Scanner;
class ex2_1{
    public static void main(String []args){
        String [] character = {"a","b","c","d","e","f"};
        double[] numbers = new double[6];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<character.length;i++){
            System.out.print("Enter "+character[i]+": ");
            numbers[i] = in.nextDouble();
        }
        double result1 = (numbers[4]*numbers[3])-(numbers[1]*numbers[5]);
        double result2 = (numbers[0]*numbers[3])-(numbers[1]*numbers[2]);
        double result3 = (numbers[0]*numbers[5])-(numbers[4]*numbers[2]);
        double divide1 = result1/result2;
        double divide2 = result3/result2;
        if(result2 == 0){
            System.out.print("The equation has no solution");
        }
        else{
            System.out.print("x is "+divide1+" and y is "+divide2);
        }
        in.close();
    }
}
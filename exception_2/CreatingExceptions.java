import java.util.Scanner;
public class CreatingExceptions{
    public static void main(String []args){
        OutOfRangeException x = new OutOfRangeException();
        final int MIN = 0,MAX = 30;
        int value = 0;
        try{
            Scanner sn = new Scanner(System.in);
            System.out.print("Enter number : ");
            value = sn.nextInt();
            x.checkvalue(value,MIN,MAX);
            sn.close();
        }catch(Exception e){
            System.out.print(e+" Exception");
            System.exit(0);
        }finally{
            System.out.print("Score is "+value*100.0f/MAX+" %");
        }
    }
}
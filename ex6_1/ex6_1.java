import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class ex6_1{
    public static void main(String []args){
        int [] array;
        int result,point = 0;
        Scanner sn = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> Result = new ArrayList<>();
        System.out.print("Enter the number of array size : ");
        int n = sn.nextInt();
        array = new int[n];
        System.out.print("Your array : ");
        System.out.print("{");
        for(int i = 0;i<n;i++){
            array[i] = random.nextInt(100);
            System.out.print(" "+array[i]+" ");
            result = array[i] % 10;
            Result.add(result);
            
        }
        System.out.println("}");
        for(int i = 0;i<n;i++){
            if(Result.get(i) == 4 || Result.get(i) == 9){
                point +=1;
            }else if(Result.get(i) == 7){
                point +=2;
            }else{
                point +=0;
            }
            Result.add(point);
        }
        System.out.println("Your score is "+point);
        sn.close();
    }
}
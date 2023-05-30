import java.util.Scanner;
import java.util.Arrays;
public class ex6_3{
    public static void main(String []args){
        double arr[] = new double[5];
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter five numbers : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sn.nextDouble();
        }
        System.out.print("The index of the min is "+arr[IndexOfSmallestElement(arr)]);
        sn.close();
    }

    public static int IndexOfSmallestElement(double[] array){
        double min = 100;
        int idx = 0;
        
        for(int i = 0;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        for(int i = 0;i<array.length;i++){
            if(array[i] == min){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
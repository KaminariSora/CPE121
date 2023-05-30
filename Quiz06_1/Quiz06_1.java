import java.util.Scanner;
import java.util.Arrays;
public class Quiz06_1{
  public static void main(String []args){
    int []arr = new int[10];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter number of your order : ");
    int order = sn.nextInt();
    System.out.print("Enter ten number : ");
    for(int i = 0;i<arr.length;i++){
        arr[i] = sn.nextInt();
    }
    Arrays.sort(arr);
    System.out.print("Your number is "+arr[Max(arr,order)]);
    sn.close();
  }
  public static int Max(int[] array,int order){
        double max = 100;
        int idx = 0;
        
        for(int i = 0;i<array.length;i++){
            if(array[i] < max){
                max = array[i];
            }
        }
        for(int i = 0;i<array.length;i++){
            if(array[i] == order){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
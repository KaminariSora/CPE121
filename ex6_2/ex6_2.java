import java.util.Scanner;
import java.util.Random;

import java.util.Arrays;
public class ex6_2{
    public static void main(String []args){
        Scanner sn = new Scanner(System.in);
        Random rn = new Random();
        int num[] = new int[4];
        int def[] = {0,0,0,0};
        System.out.print("Enter the number of array size : ");
        int n =sn.nextInt();
        for(int i = 0;i<4;i++){
            System.out.printf("Your number %d is ",i+1);
            num[i] = sn.nextInt();
        }
        Arrays.sort(num);
        int[] arr =new int[n];
        System.out.print("\nRandom array is { ");
        for(int i = 0;i<n;i++){
            arr[i] = rn.nextInt(n);
            System.out.print(arr[i]+" ");
            if(num[i] == arr[0]){
                def[0] += 1;
            }else if(num[i] == arr[1]){
                def[1] += 1;
            }else if(num[i] == arr[2]){
                def[2] += 1;
            }else if(num[i] == arr[3]){
                def[3] += 1;
            } 
        }
        System.out.print("}\n");
        System.out.print("MaxFrequency : "+def[3]);//หาได้แค่ 4 ตัวสูงสุด
        sn.close();
    }
}
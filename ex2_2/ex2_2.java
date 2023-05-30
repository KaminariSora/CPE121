import java.util.Scanner;
class ex2_2{
    public static void main(String []args){
        int number[] = new int[9];
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer : ");
        for(int i = 0;i<9;i++){
            number[i] = sn.nextInt();
        }
        int result1 = (number[0]*1)+(number[1]*2)+(number[2]*3)+(number[3]*4)+(number[4]*5);
        int result2 = (number[5]*6)+(number[6]*7)+(number[7]*8)+(number[8]*9);
        int result = (result1+result2)%11;
        System.out.print("The ISBN-10 number is ");
        for(int i = 0;i<9;i++){
          System.out.print(number[i]);
        }
        if(result != 10){
          System.out.print(result);
        }
        else{
          System.out.print("X");
        }
        sn.close();
    }
}
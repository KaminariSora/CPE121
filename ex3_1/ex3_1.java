import java.util.Scanner;
public class ex3_1{
  public static void main(String []args){
    int []number = new int[4];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer,the input ends if it is 0 : ");
    NumberPositive NUM = new NumberPositive();
    NumberNegative num = new NumberNegative();
    for(int i = 0;i<number.length;i++){
      number[i] = sn.nextInt();
    }  
    int choice = sn.nextInt();
    num.integer = number;
    NUM.integer = number;
    int result = number[0]+number[1]+number[2]+number[3];
    double avg = result/number.length;
    if(choice==0){
      System.out.print("The number of Positive is : ");
      num.Bubblesort();
      num.PrintPossitive();
      System.out.print("The number of negative is : ");
      num.Bubblesort();
      num.PrintNegative();
      System.out.printf("The total : %d\n",result);
      System.out.printf("The average is : %.2f\n",avg);    
    }else{
      System.out.print("0 Exeption please try again.");
    }
    NUM.Positive();
    sn.close();
  }
}
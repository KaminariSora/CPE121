import java.util.Scanner;
import java.util.Random;
public class Quiz06_2{
  public static void main(String []args){
    int [][] mat0;
    Scanner sn = new Scanner(System.in);
    Random rn = new Random();
    System.out.print("Enter the number of rows and coluumn of the array : ");
    int n = sn.nextInt();
    int [][] mat = new int[n][n];
    System.out.println("intialalize random matrix :");
    for(int i = 0;i<n;i++){
      for(int j = 0;j<n;j++){
        mat[i][j] = rn.nextInt(100);
        System.out.print(mat[i][j]+" ");
        if(j == n-1){
          System.out.print("\n");
        }
      }
    }
    System.out.print("Result matrix :\n");
    show49Sharp(mat);
  }
   public static void show49Sharp(int[][] matrix){
     int n = 7;
    for(int i = 0;i<n;i++){
      for(int j = 0;j<n;j++){
        if(matrix[i][3]%10 == 4 || matrix[i][6]%10 == 9){
          System.out.print(matrix[i][j]+" ");
        }else if(matrix[i][3]%10 != 4 || matrix[i][6]%10 != 9){
          System.out.print(" # ");
        }else{
          System.out.print(matrix[i][j]+" ");
        }
      }
      if(j == n-1){
        System.out.print("\n");
      }
    }
  }
}
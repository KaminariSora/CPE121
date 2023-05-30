import java.util.Scanner;
class ex6_6{
  public static void main(String[]args){
    double[][] mat1;
    mat1 = new double[3][3];
    
    double[][] mat2;
    mat2 = new double[3][3];
    
    double[][] mat3;
    mat3 = new double[3][3];
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter matrix1: ");
    for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
        mat1[i][j] = in.nextDouble();
      }
    }
    System.out.print("Enter matrix2: ");
    for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
        mat2[i][j] = in.nextDouble();
      }
    }
    
    mat3 = multiplyMatrix(mat1,mat2);
    
    System.out.println("The maltiplication of the matrices is ");
    for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
        System.out.print(mat1[i][j]+"  ");
      }
      if(i ==1) System.out.print("*   ");
      for(int j = 0;j<3;j++){
        System.out.print(mat2[i][j]+"  ");
      }
      if(i == 1) System.out.print("=   ");
      for(int j = 0;j<3;j++){
        System.out.print(mat3[i][j]+"  ");
      }
      System.out.println();
    }
  }
  public static double[][]multiplyMatrix(double[][] a,double[][] b){
    double[][] c;
    c = new double[3][3];
    for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
        c[i][j] = (a[i][0]*b[0][j])+(a[i][1]*b[1][j])+(a[i][2]*b[2][j]);
      }
    }
    return c;
  }
}
        
        
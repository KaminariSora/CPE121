import java.util.Scanner;
class ex2_3{
  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer : ");
    int result = in.nextInt();
    int integer1 = result%3;
    int integer2 = result%11;
    System.out.print(result+" ");
    if(integer1 != 0 || integer2 != 0){
      System.out.print("is not divisible by either 3 or 11");
    }else if(integer1 == 0){
      System.out.print("is divisible by both 3 or 11,but not both");
    }else if(integer2 == 0){
      System.out.print("is divisible by both 3 or 11,but not both");
    }else{
      System.out.print("is divisible by both 3 and 11");
    }
    in.close();
  }
}

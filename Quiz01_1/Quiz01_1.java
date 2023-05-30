import java.util.Scanner;
public class Quiz01_1{
  public static void main(String []args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter number of hours : ");
    int hours = sn.nextInt(); 
    int days = hours/24;
    int years = days/365;
    int Mdays = days%365;
    int mhours = hours%24;
    System.out.print(hours+" hours is appoximately "+years+" years "+Mdays+" days ands "+mhours+" hours");
    sn.close();
    //1วันมี24ชม //365วัน มี 365*24ชม 15 300 70
  }
}
class ex6_4{
  public static void main(String[]args){
    int[] ar = {1,2,3,4,5,6};
    double[] arr = {6.0,4.4,1.9,2.9,3.4,3.5};
    System.out.println("The average value as integer is "+average(ar));
    System.out.println("The average value as double is "+average(arr));
  }
  public static int average(int[] array){
    int ave = 0;
    for(int i = 0;i<6;i++){
      ave += array[i];
  }
  
    return ave/6;
  }
  public static double average(double[] array){
    double ave = 0;
    for(int i = 0;i<6;i++){
      ave += array[i];
      System.out.println(ave);
  }
    return ave/6.0;
  }
  }
  
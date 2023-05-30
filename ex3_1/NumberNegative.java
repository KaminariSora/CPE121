class NumberNegative{
  public int[] integer = new int[4];
  public void Bubblesort(){
    for(int i = 0;i<integer.length;i++){
      for(int j = 0;j<integer.length-i-1;j++){
        if(integer[j]>integer[j+1]){
          int value = integer[j];
          integer[j] = integer[j+1];
          integer[j+1] = value;
        }
      }
    } 
  }
  public void PrintPossitive(){
      System.out.printf("%d\n",integer[3]);
  }
  public void PrintNegative(){
    System.out.printf("%d\n",integer[0]);
  }
}
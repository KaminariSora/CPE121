class NumberPositive extends NumberNegative{//inheritance class
  public int []integer = new int[4];
  public void Positive(){
    Bubblesort();
    System.out.print("Sorting number : ");
    for(int i=0;i<integer.length;i++){
      System.out.printf("%d ",integer[i]);
    }
  }
}
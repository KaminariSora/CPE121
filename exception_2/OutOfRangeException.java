public class OutOfRangeException extends CreatingExceptions{
    public void checkvalue(int value,int MIN,int MAX) throws Exception{
        if(value > MIN || value < MAX){
            throw new Exception();
        }
    }
}
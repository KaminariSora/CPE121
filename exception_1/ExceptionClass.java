public class ExceptionClass extends Exception{
    public void checkvalue(int value,int x,int z) throws ExceptionClass{
        if(value < x || value > z){
            throws new ExceptionClass();
        }
    }
 }
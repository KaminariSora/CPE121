public class exception_1{
    public static void main(String []args){
        final int x = 5;
        final int y = 0;
        final int z = 5;
        final int result;
        try{
            result = x/y;
            System.out.print(result);
        }catch(Exception e1){
            System.out.println("Can't divide by 0");
            System.out.println(e1);
        }finally{
            System.out.print("Successful program");
        }
    }
}
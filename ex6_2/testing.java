
import java.util.Random;
public class testing{
    public static void main(String []args){
        int[] numbers = {1, 3, 5, 7, 9};
        Random random = new Random();
        int randomNumber = numbers[random.nextInt(numbers.length)];
        System.out.println("Random number: " + randomNumber);
    }
}
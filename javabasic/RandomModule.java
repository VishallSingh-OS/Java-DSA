package javabasic;
import java.util.Random;
public class RandomModule {
    
    public static void main (String[] args) {

        Random random = new Random();

        int number1; 
        double number2;
        boolean isHead;

        number1 = random.nextInt(1,6);
        number2 = random.nextDouble();

        isHead = random.nextBoolean();

        if (isHead) {
            System.out.println("Head");
        } else {
            System.out.println("Tails");
        }
        System.out.println(number1);
    }
}

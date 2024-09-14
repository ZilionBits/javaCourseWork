
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add((int)(Math.random()*100));
        }

        printNumbersInRange(numbers,5,55);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers,
                                           int lowerLimit,
                                           int upperLimit) {
        System.out.printf("The numbers in the range [%d,%d]\n", lowerLimit, upperLimit);

        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }


    }
    
}

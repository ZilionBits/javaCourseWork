
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times


        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int userNumber = Integer.parseInt(scanner.nextLine());
            if(userNumber==9999) {
                break;
            }
            numbers.add(userNumber);
        }

        int min = Integer.MAX_VALUE;
        int indexCount = 0;

        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.printf("Smallest number: %d", min);

        for (int number : numbers) {
            if (min == number) {
                System.out.printf("Found at index: %d", indexCount);
            }
            indexCount++;
        }




        
    }
}

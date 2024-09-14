
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameDigit = 0;
        int sum = 0;
        int count = 0;
        String name = "";

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] nameAge = sentence.split(",");
            int number = nameAge[0].length();

            sum += Integer.parseInt(nameAge[1]);
            count++;

            if (number > nameDigit) {
                nameDigit = number;
                name = nameAge[0];
            }
        }

        System.out.printf("Longest name: %s \n", name);
        System.out.println("Average of the birth years: " + (double)sum/count);
    }
}

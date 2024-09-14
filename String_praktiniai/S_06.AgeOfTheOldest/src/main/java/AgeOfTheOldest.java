
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] words = sentence.split(",");
            int age = Integer.parseInt(words[1]);

            if (age > max) {
                max = age;
            }
        }
        System.out.println("Age of the oldest: " + max);
    }
}

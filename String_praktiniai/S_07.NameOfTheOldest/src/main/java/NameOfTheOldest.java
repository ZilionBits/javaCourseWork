
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String name = "";
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] nameAge = sentence.split(",");
            int age = Integer.parseInt(nameAge[1]);

            if (age > max) {
                max = age;
                name = nameAge[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}

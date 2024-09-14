
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String searchingName = scanner.nextLine();

        int foundCounter = 0;
        for (String name : list) {
            if (name.equals(searchingName)) {
                System.out.printf("%s was found!", searchingName);
                foundCounter++;
                break;
            }
        }
        if (foundCounter == 0) {
            System.out.printf("%s was not found!", searchingName);
        }
    }
}

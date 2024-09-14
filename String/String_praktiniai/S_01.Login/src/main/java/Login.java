import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName1 = "alex";
        String alexPswd = "sunshine";

        String userName2 = "emma";
        String emmaPswd = "haskell";

        System.out.println("Enter username: ");
        String name = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        if (name.equals(userName1) && password.equals(alexPswd)) {
            System.out.println("You have successfully logged in!");
        } else if (name.equals(userName2) && password.equals(emmaPswd)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}

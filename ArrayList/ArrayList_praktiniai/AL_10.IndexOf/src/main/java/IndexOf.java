
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int searchingNumber = Integer.parseInt(scanner.nextLine());
        int indexCount = 0;

        for (int number : list) {
            if (searchingNumber == number) {
                System.out.printf("%d is at index %d",searchingNumber,indexCount);
            }
            indexCount++;
        }

    }
}

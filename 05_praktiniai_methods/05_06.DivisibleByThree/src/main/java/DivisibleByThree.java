
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Beginning number?");
        int beginning = Integer.parseInt(scanner.nextLine());
        System.out.println("Ending number?");
        int end = Integer.parseInt(scanner.nextLine());

        divisibleByThreeInRange(beginning,end);


    }
    public static void divisibleByThreeInRange(int beginning, int end) {

        for(int i = beginning; i <= end; i++) {
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}

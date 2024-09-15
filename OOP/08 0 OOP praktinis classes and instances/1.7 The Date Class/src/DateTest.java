import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Day: ");
        int day = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Month: ");
        int month = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Year: ");
        int year = Integer.parseInt(scan.nextLine());

        Date d = new Date(day,month,year);

        System.out.println(d);

    }
}

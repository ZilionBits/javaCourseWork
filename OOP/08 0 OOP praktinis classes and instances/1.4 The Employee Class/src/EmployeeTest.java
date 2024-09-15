import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        int id = 1;
        String firstName = "Bob";
        String lastName = "Bobby";
        System.out.println("What salary Bob gave?");
        Scanner scan = new Scanner(System.in);
        int salary = Integer.parseInt(scan.nextLine());
        System.out.println("What raise we give to Bob in percent [0-100]?");
        int percent = Integer.parseInt(scan.nextLine());

        Employee e = new Employee(id,firstName,lastName,salary);
        e.raiseSalary(percent);

        System.out.println(e);

    }
}

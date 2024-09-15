import java.util.ArrayList;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Peter");
        ArrayList<Integer> balances = new ArrayList<>();
        balances.add(5000);
        balances.add(4000);

        System.out.println("Enter account ID: ");
        String id = scan.nextLine();

        Account a2Parameter = new Account(id, names.get(Integer.parseInt(id)-1));
        Account a3Parameter = new Account(id, names.get(Integer.parseInt(id)-1), balances.get(Integer.parseInt(id)-1));

        System.out.println(a3Parameter);
        a3Parameter.credit(1000);
        System.out.println(a3Parameter);
        a3Parameter.debit(2000);
        System.out.println(a3Parameter);
        a3Parameter.transferTo("another", 1000);
        System.out.println(a3Parameter);


    }
}


import java.util.Collections;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book books = new Book();

        while(true) {
            System.out.println("Name of the book: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            books.addBook(new Book(name,age));

        }
        books.printBookCounter();
        System.out.println();

        System.out.println("Books:");
        for(Book nameAndReq : books.getBooks()) {
            System.out.println(nameAndReq);
        }
        System.out.println();

        System.out.println("Sort by age:");
        Collections.sort(books.getBooks());
        books.getBooks().forEach(System.out::println);

        System.out.println("\nSort by name then age:");
        books.getBooks().sort(new SorterNameAge());
        books.getBooks().forEach(System.out::println);

    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            String bookTitle = scan.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            int bookPages = Integer.parseInt(scan.nextLine());
            int bookYear = Integer.parseInt(scan.nextLine());

            Book book = new Book(bookTitle,bookPages,bookYear);
            books.add(book);
        }

        System.out.println("What information will be printed?");
        String printChoose = scan.nextLine();

        for (Book book : books) {
            if (printChoose.equals("name")){
                System.out.println(book.getTitle());
            }
            if (printChoose.equals("everything")) {
                System.out.println(book);
            }
        }
    }
}

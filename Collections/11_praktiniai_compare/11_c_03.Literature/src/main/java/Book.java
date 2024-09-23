import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {
    private String name;
    private int ageReq;
    private List<Book> books = new ArrayList<>();
    private int counter;

    public Book(){

    }

    public Book(String name, int ageReq) {
        this.name = name;
        this.ageReq = ageReq;
    }
    public String getName(){
        return name;
    }
    public int getAgeReq(){
        return ageReq;
    }

    public void addBook(Book book) {
        books.add(book);
        counter++;
    }
    public List<Book> getBooks(){
        return books;
    }
    public void printBookCounter() {
        System.out.println(counter + (counter != 1 ? " books" : " book") +" in total.");
    }

    @Override
    public String toString() {
        return name + " (recommended for " + ageReq + " years-old or older)";
    }

    @Override
    public int compareTo(Book o) {
            return this.ageReq - o.ageReq;
    }
}

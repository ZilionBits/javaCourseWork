public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String bookTitle, int bookPages, int bookYear) {
        title = bookTitle;
        pages = bookPages;
        year = bookYear;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title+", "+pages+" pages, "+year;
    }

}

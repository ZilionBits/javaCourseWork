import java.util.Comparator;

public class SorterNameAge extends Book implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return o1.getAgeReq() - o2.getAgeReq();
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

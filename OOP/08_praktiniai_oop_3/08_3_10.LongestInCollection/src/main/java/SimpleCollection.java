
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        int longestNumber = Integer.MIN_VALUE;
        String longestName = null;
        if (elements.isEmpty()) {
            return null;
        } else {
            for (String element : elements) {
                if (element.length() > longestNumber) {
                    longestNumber = element.length();
                    longestName = element;
                }
            }
            return longestName;
        }
    }

}

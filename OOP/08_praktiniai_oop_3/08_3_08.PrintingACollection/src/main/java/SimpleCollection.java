
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

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection "+ name +" is empty.";
        } else if (elements.size() == 1) {
            StringBuilder notSimple = new StringBuilder("The collection "+ name +" has " + elements.size() + " element:\n");

            for (String element : elements) {
                notSimple.append(element);
            }

            return notSimple.toString();
        }
        StringBuilder notSimple = new StringBuilder("The collection "+ name +" has " + elements.size() + " elements:\n");

        for (String element : elements) {
            notSimple.append(element).append("\n");
        }

        return notSimple.toString();
    }

}

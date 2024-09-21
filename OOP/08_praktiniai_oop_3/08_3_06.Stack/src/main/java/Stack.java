import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void add(String value) {
        if (isEmpty()) {
            stack.add(value);
        } else {
            stack.add(0, value);
        }
    }
    public ArrayList<String> values() {
        return stack;
    }
    public String take() {
        String temp = null;
        if (!isEmpty()) {
            temp = stack.get(0);
            stack.remove(0);
        }
        return temp;
    }
}

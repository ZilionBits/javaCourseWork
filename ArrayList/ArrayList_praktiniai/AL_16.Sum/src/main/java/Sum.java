
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add((int)(Math.random()*100));
        }
        System.out.println(sum(numbers));
    }
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}

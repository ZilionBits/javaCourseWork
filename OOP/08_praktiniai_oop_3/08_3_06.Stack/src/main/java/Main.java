
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();

        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("1");
        s.add("2");
        s.add("3");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.take();
        System.out.println(s.values());

    }
}

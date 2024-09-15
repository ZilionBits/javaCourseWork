public class TimeTest {
    public static void main(String[] args) {
        int hour = 23;
        int minute = 59;
        int second = 59;

        Time t = new Time(hour,minute,second);

        System.out.println(t);
        System.out.println(t.nextSecond());
        System.out.println(t.previousSecond());

    }
}

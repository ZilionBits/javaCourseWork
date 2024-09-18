public class Counter {
    private int value;

    public Counter() {
        this(0);
    }
    public Counter(int startValue) {
        value = startValue;
    }

    public int value() {
        return value;
    }
    public void increase() {
        value++;
    }
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }
    public void decrease() {
        value--;
    }
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}

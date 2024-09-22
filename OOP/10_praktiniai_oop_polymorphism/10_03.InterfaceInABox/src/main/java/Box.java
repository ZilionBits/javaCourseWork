import java.util.ArrayList;

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> items = new ArrayList<>();

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable object){
        if((weight() + object.weight())<=maxCapacity) {
            items.add(object);
        }
    }
    public String toString(){
        String properGrammar =
                (items.size() != 1) ? " items" : " item";
        return "Box: " + items.size() + properGrammar + ", total weight " +
                weight() + " kg";
    }

    @Override
    public double weight() {
        double weight = 0;
        for(Packable object : items) {
            weight += object.weight();
        }
        return weight;
    }
}

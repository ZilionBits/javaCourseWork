import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void addItem(Item item) {
        if ((item.getWeight()+totalWeight())<=maxWeight) {
            items.add(item);
        }
    }
    public void printItems() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for(Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem() {
        if (!items.isEmpty()) {
            Item heaviestItem = null;
            int max = Integer.MIN_VALUE;
            for(Item item : items) {
                if (item.getWeight() > max) {
                    max = item.getWeight();
                    heaviestItem = item;
                }
            }
            return heaviestItem;
        }
        return null;
    }

    @Override
    public String toString() {
        String properEnglish =
                (items.size() == 1) ? " item " : " items ";
        String itemsNumber =
                (items.isEmpty()) ? "no" : String.valueOf(items.size());

        return itemsNumber + properEnglish + "(" + totalWeight() + " kg)";
    }
}

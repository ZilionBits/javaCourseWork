import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if((totalWeight()+suitcase.totalWeight())<=maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for(Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    public void printItems() {
        for(Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        String properEnglish =
                (suitcases.size() == 1) ? " suitcase " : " suitcases ";

        return suitcases.size() + properEnglish + "(" + totalWeight() + " kg)";
    }
}

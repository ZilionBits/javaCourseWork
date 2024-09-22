package lt.techin.shop;

import java.util.ArrayList;

public class Pantry implements Shop{
    private ArrayList<Pantry> pantry = new ArrayList<>();

    @Override
    public double grossPriceEuro() {
        return 0;
    }
    @Override
    public double grossPriceEuro(double vol) {
        return 0;
    }

    public ArrayList<Pantry> getPantry() {
        return pantry;
    }
    public void addToPantry(Object item) {
        pantry.add((Pantry) item);
    }
}

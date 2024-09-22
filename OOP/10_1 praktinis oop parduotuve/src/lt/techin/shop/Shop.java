package lt.techin.shop;

import java.util.ArrayList;

public interface Shop {
    double FRANK = 0.95;

    public void addToPantry(Object item);
    public ArrayList<Pantry> getPantry();
    double grossPriceEuro();
    double grossPriceEuro(double vol);
    //Exchange rate 1 euro = 0.95 Swiss Frank
    default double convertGrossPriceToSwissFrank() {
        return grossPriceEuro()*FRANK;
    };

}

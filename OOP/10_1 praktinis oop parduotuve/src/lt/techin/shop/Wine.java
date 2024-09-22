package lt.techin.shop;

public class Wine extends Pantry{
    private String name;
    private double netPrice;

    public Wine(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    public double grossPriceEuro(double vol){
        double priceAfterTaxes = netPrice*1.21;
        if(vol <= 8.5) {
            priceAfterTaxes += 0.28;
        } else {
            priceAfterTaxes += 0.72;
        }
        return priceAfterTaxes;
    }
}

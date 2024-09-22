package lt.techin.shop;

public class AlcoholDrink extends Pantry{
    private String name;
    private double netPrice;

    public AlcoholDrink(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    public double grossPriceEuro(double vol){
        double priceAfterTaxes = netPrice*1.21;
        if(vol <= 15) {
            priceAfterTaxes += 0.89;
        } else {
            priceAfterTaxes += 1.26;
        }
        return priceAfterTaxes;
    }
}

package lt.techin.shop;

public class RegularItem extends Pantry{
    private String name;
    private double netPrice;

    public RegularItem(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    public double grossPriceEuro(){
        return netPrice*1.21;
    }
}

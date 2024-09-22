package lt.techin.shop;

public class Medicine extends Pantry{
    private String name;
    private double netPrice;

    public Medicine(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    public double grossPriceEuro(){
        return netPrice*1.09;
    }
}

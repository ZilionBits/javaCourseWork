public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        price = initialPrice;
        quantity = initialQuantity;
        name = initialName;
    }
    public void printProduct() {
        System.out.printf("%s, price %.2f, %d pcs",name,price,quantity);
    }
}

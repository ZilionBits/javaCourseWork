

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouseWithHistory a = new ProductWarehouseWithHistory("Apple",100,50);
        ProductWarehouseWithHistory b = new ProductWarehouseWithHistory("Orange",300,50);
        ProductWarehouseWithHistory c = new ProductWarehouseWithHistory("Kiwi",200,20);

        System.out.println(a);
        System.out.println(a.history());
        a.addToWarehouse(5);
        System.out.println(a);
        System.out.println(a.history());
        a.takeFromWarehouse(10);
        System.out.println(a);
        System.out.println(a.history());
        System.out.println();

        a.printAnalysis();
    }

}

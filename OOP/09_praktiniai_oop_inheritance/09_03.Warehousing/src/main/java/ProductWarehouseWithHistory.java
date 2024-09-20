public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName,capacity);
        setBalance(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history() {
        return history.toString();
    }
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            setBalance(getBalance() + amount);
            this.history.add(getBalance());
        } else {
            setBalance(getCapacity());
            this.history.add(getCapacity());
        }
    }
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > getBalance()) {
            double allThatWeCan = getBalance();
            setBalance(0.0);
            this.history.add(getBalance());
            return allThatWeCan;
        }

        setBalance(getBalance() - amount);
        this.history.add(getBalance());
        return amount;
    }
    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}

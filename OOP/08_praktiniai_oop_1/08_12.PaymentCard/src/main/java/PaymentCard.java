public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (2.6 <= balance) {
            this.balance -= 2.6;
        }
    }
    public void eatHeartily() {
        if (4.6 <= balance) {
            this.balance -= 4.6;
        }
    }
    public void addMoney(double deposit) {
        if (deposit>=0) {
            this.balance += deposit;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    public String toString() {
        return "The card has a balance of "+balance+" euros";
    }
}

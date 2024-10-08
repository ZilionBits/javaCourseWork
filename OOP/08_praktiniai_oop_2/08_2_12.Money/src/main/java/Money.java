
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        return new Money(newEuros,newCents);
    }
    public boolean lessThan(Money compared) {
        return this.euros*100+this.cents < compared.euros*100+ compared.cents;
    }
    public Money minus(Money decreaser) {
        int thisCents = this.euros*100+this.cents;
        int decreaserCents = decreaser.euros*100+decreaser.cents;

        if (thisCents-decreaserCents > 0) {
            int newEuros = (thisCents-decreaserCents)/100;
            int newCents = (thisCents-decreaserCents)%100;
            return new Money(newEuros,newCents);
        }
      return new Money(0,0);
    }

}

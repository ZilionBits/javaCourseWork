
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("----------------------");

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        System.out.println("----------------------");

        PaymentTerminal unicafeExactum = new PaymentTerminal();
//        System.out.println(unicafeExactum.eatAffordably(2.51));
//        System.out.println(unicafeExactum.eatHeartily(5));

        System.out.println("remaining change " + unicafeExactum.eatAffordably(11));
        System.out.println("remaining change " + unicafeExactum.eatAffordably(5.5));
        System.out.println("remaining change " + unicafeExactum.eatHeartily(5));
        System.out.println(unicafeExactum);
        System.out.println("----------------------");

        PaymentCard myCard = new PaymentCard(7);
        wasSuccessful = unicafeExactum.eatHeartily(myCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(myCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(myCard);
        System.out.println("there was enough money: " + wasSuccessful);
        System.out.println(unicafeExactum);

        System.out.println("----------------------");

        System.out.println(unicafeExactum);
        PaymentCard newCard = new PaymentCard(2);
        System.out.println("Money in the card " + newCard.balance());
        wasSuccessful = unicafeExactum.eatHeartily(newCard);
        System.out.println("there was enough money: " + wasSuccessful);
        unicafeExactum.addMoneyToCard(newCard, 100);
        wasSuccessful = unicafeExactum.eatHeartily(newCard);
        System.out.println("there was enough money: " + wasSuccessful);
        System.out.println("Money in the card " + newCard.balance());
        System.out.println(unicafeExactum);

        System.out.println("----------------------");
    }
}


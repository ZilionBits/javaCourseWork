
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.printf("Paul: %s\n",paulCard);
        System.out.printf("Matt: %s\n",mattCard);
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        System.out.printf("Paul: %s\n",paulCard);
        System.out.printf("Matt: %s\n",mattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.printf("Paul: %s\n",paulCard);
        System.out.printf("Matt: %s\n",mattCard);

    }
}

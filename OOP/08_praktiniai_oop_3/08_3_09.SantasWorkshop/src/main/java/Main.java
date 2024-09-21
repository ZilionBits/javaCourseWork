
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Package gifts = new Package();

        gifts.addGift(new Gift("aaa",3));
        gifts.addGift(new Gift("bbb",3));
        gifts.addGift(new Gift("ccc",3));

        System.out.println(gifts.totalWeight());

    }
}

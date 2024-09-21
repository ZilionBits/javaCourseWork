
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Hold hold = new Hold(30);
        Suitcase suitcase1 = new Suitcase(2);

        suitcase1.addItem(new Item("aaa",6));
        suitcase1.addItem(new Item("bbb",3));
        suitcase1.addItem(new Item("ccc",3));

        Suitcase suitcase2 = new Suitcase(15);

        suitcase2.addItem(new Item("ddd",3));
        suitcase2.addItem(new Item("eee",3));
        suitcase2.addItem(new Item("fff",3));

        hold.addSuitcase(suitcase1);
        hold.addSuitcase(suitcase2);

        System.out.println(suitcase1);

        System.out.println(hold);
        hold.printItems();




    }

}

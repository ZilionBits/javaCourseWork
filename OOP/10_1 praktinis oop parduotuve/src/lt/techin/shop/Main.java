package lt.techin.shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Pantry();

        shop.addToPantry(new AlcoholDrink("Vodka", 10));
        shop.addToPantry(new Medicine("Pill",5));
        shop.addToPantry(new Wine("White",15));

        System.out.println(shop.getPantry().get(0).grossPriceEuro(16));
        System.out.println(shop.getPantry().get(1).grossPriceEuro());
        System.out.println(shop.getPantry().get(2).grossPriceEuro(7));


    }
}

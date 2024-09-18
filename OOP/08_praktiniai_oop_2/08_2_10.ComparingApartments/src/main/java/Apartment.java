
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        return squares > compared.squares;
    }
    public int priceDifference(Apartment compared) {
        return Math.abs((compared.princePerSquare*compared.squares)-(princePerSquare*squares));
    }
    public boolean moreExpensiveThan(Apartment compared) {
        return princePerSquare*squares > compared.princePerSquare*compared.squares;
    }


}

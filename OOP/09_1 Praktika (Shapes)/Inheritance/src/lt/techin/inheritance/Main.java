package lt.techin.inheritance;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        System.out.println(shape.isFilled());

    }
}

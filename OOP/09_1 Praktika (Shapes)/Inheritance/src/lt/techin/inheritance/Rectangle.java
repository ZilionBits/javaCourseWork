package lt.techin.inheritance;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return getLength()*getWidth();
    }
    public double getPerimeter() {
        return (getLength()+getWidth())*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width +
                " and length=" + length +
                ", which is a subclass of " + super.toString();
    }
}

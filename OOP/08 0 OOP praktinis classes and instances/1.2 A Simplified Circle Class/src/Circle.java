public class Circle {
    private double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.pow(getRadius(),2)*Math.PI;
    }
    public double getCircumference() {
        return 2*Math.PI*getRadius();
    }
    public String toString() {
        return "Circle[radius="+getRadius()+"]";
    }
}

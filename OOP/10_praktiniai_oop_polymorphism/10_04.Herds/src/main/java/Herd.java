import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> movables = new ArrayList<>();

    public void addToHerd(Movable movable) {
        movables.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable movable : movables) {
            movable.move(dx,dy);
        }
    }
    @Override
    public String toString() {
        StringBuilder coordinates = new StringBuilder();
        for (Movable movable  : movables) {
            coordinates.append(movable.toString()).append("\n");
        }

        return coordinates.toString();
    }
}
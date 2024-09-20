import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> whHistory;

    public ChangeHistory() {
        whHistory = new ArrayList<>();
    }

    public void add(double status) {
        whHistory.add(status);
    }

    public void clear() {
        whHistory.clear();
    }

    public double maxValue() {
        if (whHistory.isEmpty()) {
            return 0;
        }
        return Collections.max(whHistory);
    }

    public double minValue() {
        if (whHistory.isEmpty()) {
            return 0;
        }
        return Collections.min(whHistory);
    }

    public double average() {
        if (whHistory.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for(Double element : whHistory) {
            sum += element;
        }
        return sum/whHistory.size();
    }

    public String toString() {
        return whHistory.toString();
    }
}

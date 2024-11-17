import java.util.HashMap;
import java.util.Map;

public class IOU {
    private HashMap<String, Double> oweList = new HashMap<>();

    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
            oweList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return oweList.containsKey(toWhom) ?
                oweList.get(toWhom) : 0;
    }
}

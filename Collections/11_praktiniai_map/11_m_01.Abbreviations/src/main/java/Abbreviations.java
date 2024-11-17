import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    Map<String, String> storage = new HashMap<>();

    public Abbreviations() {
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        storage.put(abbreviation,explanation);
    }
    public boolean hasAbbreviation(String abbreviation) {
        return storage.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation) {
        return storage.get(abbreviation);
    }

}

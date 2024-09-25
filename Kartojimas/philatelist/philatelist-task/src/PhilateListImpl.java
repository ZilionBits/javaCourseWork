import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;
import java.util.*;

public class PhilateListImpl implements Philatelist {
    Collection<PostStamp> postStamps = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhilateListImpl that = (PhilateListImpl) o;
        return Objects.equals(postStamps, that.postStamps);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(postStamps);
    }

    @Override
    public void addToCollection(PostStamp postStamp) throws IllegalArgumentException {
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty()) {
            throw new IllegalArgumentException();
        } else if (!postStamps.contains(postStamp)) {
            postStamps.add(postStamp);
        }
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return postStamps.size();
    }

    @Override
    public void printAllPostStampNames() {
        postStamps.stream().map(PostStamp::getName)
                .forEach(System.out::println);
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) throws IllegalArgumentException {
        if (v < 0) {
            throw new IllegalArgumentException();
        } else {
            postStamps.stream()
                    .filter(nominalPrice -> nominalPrice.getMarketPrice() > v)
                    .map(PostStamp::getName)
                    .forEach(System.out::println);

        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) throws IllegalArgumentException {
        if (postStamp == null) {
            throw new IllegalArgumentException();
        }
        return postStamps.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) throws IllegalArgumentException {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        return postStamps.stream()
                .map(PostStamp::getName)
                .anyMatch(p -> p.contains(s));
    }

    @Override
    public double calculateTotalMarketPrice() {
        return postStamps.stream()
                .mapToDouble(PostStamp::getMarketPrice).sum();
    }

    @Override
    public double getAveragePostStampPrice() {
        return postStamps.stream()
                .mapToDouble(PostStamp::getMarketPrice)
                .average().orElse(0);
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue(){
        return postStamps.stream()
                .max(Comparator.comparing(PostStamp::getMarketPrice))
                .orElse(null);
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) throws IllegalArgumentException {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        return postStamps.stream()
                .filter(p -> p.getName().contains(s)).toList();
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        return postStamps.stream()
                .sorted(Comparator.comparing(PostStamp::getName))
                .toList();
    }
}

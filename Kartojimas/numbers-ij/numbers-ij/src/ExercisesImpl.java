import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;
import java.util.function.Function;

public class ExercisesImpl implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().min(Comparator.naturalOrder()).orElse(0);
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list.stream().max(Comparator.naturalOrder()).orElse(0);
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o == o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> numbers = new ArrayList<>();
        iterator.forEachRemaining(numbers::add);
        return numbers;
    }

    @Override
    public int computeSumOfNumbers(int i) {
        return (i * (i + 1)) / 2;
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        int sum = 0;
        while (i > 0) {
            if (numberFilter.accept(i)) {
                sum += i;
            }
            i--;
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        List<Integer> numbers = new ArrayList<>();
        for (int j = 1; j < i; j++) {
            numbers.add(j);
        }
        return numbers;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (Integer number : list) {
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);
        }
        return numbers;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new IntegerGenerator() {
            private int start = i;

            @Override
            public Integer getNext() {
                if (start > i1) {
                    return null;
                }
                Function<Integer, Integer> function = n -> n + 1;
                int result = start;
                start = function.apply(start);
                return result;
            }
        };
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new IntegerGenerator() {
            @Override
            public Integer getNext() {
                if (integerGenerator.getNext()==null) {
                    return null;
                }
                int number = integerGenerator.getNext();
                if (numberFilter.accept(number)) {
                    return number;
                }
                return getNext();
            }
        };
    }

}

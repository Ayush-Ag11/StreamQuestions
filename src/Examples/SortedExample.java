package Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 4, 7, 6, 1, 3, 9, 4, 6, 5, 7, 6, 1, 3, 7, 3, 9, 2);

        integerList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> fruits = Arrays.asList("Apple", "Pear", "Strawberry", "Grapefruit");

        fruits.stream()
                .sorted(Comparator.comparingInt((String x) -> x.length())
                        .thenComparing((x1, x2) -> x1.compareTo(x2)))
                .forEach(System.out::println);
    }
}

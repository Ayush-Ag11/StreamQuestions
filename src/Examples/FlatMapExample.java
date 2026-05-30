package Examples;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {
        //flatmap -> to flatten complex data structure and then to perform operation on each element.
        List<List<Integer>> integerList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(6, 7, 8, 9),
                Arrays.asList(10, 11, 12, 13, 14, 15));

        integerList.stream()
                .flatMap(x -> x.stream())
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}

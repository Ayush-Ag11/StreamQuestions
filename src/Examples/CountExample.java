package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 4, 7, 6, 1, 3, 9, 4, 6, 5, 7, 6, 1, 3, 7, 3, 9, 2);

        long count = integerList.stream()
                .filter(i -> i % 2 == 0)
                .count();

        List<Integer> integers = integerList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(count);

        System.out.println(integers);
    }
}

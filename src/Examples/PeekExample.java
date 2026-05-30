package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PeekExample {

    public static void main(String[] args) {
        //Peek -> perform some functions but not modify the stream
        List<List<Integer>> integerList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(6, 7, 8, 9),
                Arrays.asList(10, 11, 12, 13, 14, 15));

        Set<Integer> integers = integerList.stream()
                .flatMap(x -> x.stream())
                .peek(x -> System.out.println(x)).collect(Collectors.toSet());
//                .filter(x -> x % 2 == 0)
//                .peek(x -> System.out.println(x))
//                .map(x -> x * x)
//                .peek(x -> System.out.println(x))
//                .forEach(System.out::println);

        System.out.println(integers);
    }
}

package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {

    //filter -> acts as a gate function
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> integerStream = integerList.stream().filter(x -> x > 3);

        integerStream.forEach(System.out::println);
    }
}

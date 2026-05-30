package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 4, 7, 6, 1, 3, 9, 4, 6, 5, 7, 6, 1, 3, 7, 3, 9, 2);

        Set<Integer> integers = integerList.stream().sorted().distinct().collect(Collectors.toSet());

        System.out.println(integers);
    }
}

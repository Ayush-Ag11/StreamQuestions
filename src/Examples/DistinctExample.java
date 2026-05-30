package Examples;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5);

        integerList.stream().distinct().forEach(System.out::println);
    }
}

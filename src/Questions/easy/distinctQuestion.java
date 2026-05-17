package Questions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class distinctQuestion {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 5, 9, 10, 3, 6
        );

        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(distinct);
    }
}

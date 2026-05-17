package Questions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class findAverage {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 5, 8, 10);

        Double average = numbers.stream().mapToInt(n -> n).average().orElse(0.0);

        System.out.println(average);
    }
}

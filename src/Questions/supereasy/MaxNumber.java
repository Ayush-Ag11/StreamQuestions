package Questions.supereasy;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 5, 8, 10);

        Integer max = numbers.stream().max((x, y) -> x - y).orElse(null);

        //by using reduce
        Integer reduced = numbers.stream().reduce(0, (x, y) -> Integer.max(x, y));

        System.out.println(reduced + " from reduce method");

        System.out.println(max);
    }
}

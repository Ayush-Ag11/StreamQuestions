package Questions.supereasy;

import java.util.Arrays;
import java.util.List;

public class SumOrProductQuestion {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 5, 8, 10);

        Integer sum = numbers.stream().reduce(0, (x, y) -> x + y);

        Integer product = numbers.stream().reduce(1, (x, y) -> x * y);

        System.out.println(sum);
        System.out.println(product);
    }
}

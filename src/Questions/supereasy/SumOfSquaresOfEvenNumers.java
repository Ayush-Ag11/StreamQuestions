package Questions.supereasy;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 5, 8, 10);

        Integer sumOfSquares = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, (x, y) -> x + y);

        System.out.println(sumOfSquares);
    }
}

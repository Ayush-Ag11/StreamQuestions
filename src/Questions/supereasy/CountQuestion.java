package Questions.supereasy;

import java.util.Arrays;
import java.util.List;

public class CountQuestion {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 5, 8, 10);

        long count = numbers.stream().filter(n -> n > 5).count();
        System.out.println(count);

    }
}

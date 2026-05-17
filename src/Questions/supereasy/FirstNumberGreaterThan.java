package Questions.supereasy;

import java.util.Arrays;
import java.util.List;

public class FirstNumberGreaterThan {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 5, 8, 10);

        Integer integer = numbers.stream().filter(n -> n > 10).findFirst().orElse(null);

        System.out.println(integer);
    }
}

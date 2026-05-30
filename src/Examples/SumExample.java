package Examples;

import java.util.Arrays;
import java.util.List;

public class SumExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 4, 7, 6, 1, 3, 9, 4, 6, 5, 7, 6, 1, 3, 7, 3, 9, 2);

        int sum = integerList.stream()
                .mapToInt(x -> x.intValue())
                .distinct()
                .sum();

        System.out.println(sum);
    }
}

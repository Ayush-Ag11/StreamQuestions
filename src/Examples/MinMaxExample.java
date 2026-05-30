package Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 4, 7, 6, 1, 3, 9, 4, 6, 5, 7, 6, 1, 3, 7, 3, 9, 2);

        Optional<Integer> min = integerList.stream().min(Comparator.naturalOrder());

        System.out.println("Minimum integer is : " + min.get());

        Optional<Integer> max = integerList.stream().max(Comparator.naturalOrder());

        System.out.println("Maximum integer is : " + max.get());


    }
}

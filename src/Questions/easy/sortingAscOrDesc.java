package Questions.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortingAscOrDesc {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 11, 5, 8, 10);

        List<Integer> integers = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println(integers);

        //for desc
        List<Integer> list = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(list);

    }
}

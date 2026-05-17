package Questions.supereasy;

import java.util.List;
import java.util.stream.Collectors;

public class MapQuestion {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5);

        List<Integer> integers = list.stream().map(x -> x * x).collect(Collectors.toList());

        System.out.println(integers);
    }
}

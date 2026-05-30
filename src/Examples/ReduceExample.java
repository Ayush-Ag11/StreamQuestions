package Examples;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    // Reduce -> reduce to one element.
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Integer reduced = integerList.stream().reduce(0, Integer::sum);

        System.out.println(reduced);
    }
}

package Examples;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 4, 7, 6, 1, 3, 9, 4, 6, 5, 7, 6, 1, 3, 7, 3, 9, 2);

        boolean anyMatch = integerList.stream()
                .anyMatch(integer -> integer % 20 == 0);

        System.out.println(anyMatch);
    }
}

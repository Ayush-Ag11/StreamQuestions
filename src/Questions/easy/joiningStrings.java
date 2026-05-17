package Questions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningStrings {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "Apple",
                "Banana",
                "Avocado",
                "Mango",
                "Apricot",
                "Orange",
                "Grapes",
                "Almond",
                "Kiwi",
                "Anchovy"
        );

        String collect = words.stream().sorted().collect(Collectors.joining(", "));

        System.out.println(collect);
    }
}

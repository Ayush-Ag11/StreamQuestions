package Questions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringStartingWithSpecificLetter {

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

        List<String> wordsWithA = words
                .stream()
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(wordsWithA);

        //for words not with A
        List<String> wordsNotWithA = words
                .stream()
                .filter(word -> !word.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(wordsNotWithA);
    }
}

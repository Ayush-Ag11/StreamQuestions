package Examples;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    //Map -> transforming function
    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob", "carl", "david", "edge");

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

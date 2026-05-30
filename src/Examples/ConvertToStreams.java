package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreams {

    public static void main(String[] args) {

        //primitive array
        int[] primitiveArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(primitiveArray);

        intStream.forEach(System.out::println);


        //ObjectArray
        Integer[] objectArray = {1, 2, 3, 4, 5};

        Stream<Integer> integerStream = Stream.of(objectArray);

        integerStream.forEach(System.out::println);


        //collections Array
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        integerList.forEach(System.out::println);
    }
}

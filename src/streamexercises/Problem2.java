package streamexercises;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> integers = numbers.stream()
                .filter(i-> i%2==0)
                .collect(Collectors.toList());

        System.out.println(integers);


    }
}

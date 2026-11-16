package streamexercises;

import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

    }
}

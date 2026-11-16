package streamexercises;

import java.util.List;

public class Problem3 {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "cherry");
        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

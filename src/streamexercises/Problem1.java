package streamexercises;

import java.util.List;

public class Problem1 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int result = numbers.stream()
                .reduce(Integer::sum
        ).get();
        System.out.println(result);

    }
}

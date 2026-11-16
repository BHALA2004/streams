package streamexercises;

import java.util.Comparator;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 49, 8, 98, 25);
        int m = numbers.stream()
                .max((x,y)-> x > y ? 1 : -1).get();

        Comparator<Integer> compare = Integer::compare;

        int  n = numbers.stream().max(compare).get();
        System.out.println(m + " " + n);


    }
}

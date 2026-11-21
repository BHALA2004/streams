package collectorsexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxBySummingInt {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,1,6,2,8,1,0);
        Optional<Integer> collect = list.stream().collect(Collectors.minBy(Comparator.comparingInt(Integer::intValue)));
        System.out.println(collect.get());

        Optional<Integer> collect1 = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Integer::intValue)));
        System.out.println(collect1.get());

        Integer collect2 = list.stream().collect(Collectors.summingInt(n -> n));
        System.out.println(collect2);

        Double collect3 = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println( collect3);

        Long collect4 = list.stream().collect(Collectors.counting());
        System.out.println(collect4);


    }
}

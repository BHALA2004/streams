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

        Optional<Integer> collect1 = list.stream().collect(Collectors.maxBy(Integer::compare));
        System.out.println(collect1.get());

        Optional<Integer> collect5 = list.stream().max(Integer::compare);
        System.out.println(collect5.get());

        Integer collect2 = list.stream().collect(Collectors.summingInt(n -> n));
        System.out.println(collect2);

        Double collect3 = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println( collect3);

        Long collect4 = list.stream().collect(Collectors.counting());
        System.out.println(collect4);

        Comparator<Integer> comparator = Integer::compare;
        List<Integer> list3 = list.stream().sorted(comparator.reversed()).toList();
        System.out.println(list3);

        Comparator<Integer> compare =  (x,y) -> x < y ? 1 : (x == y ? 0 : -1);;
        List<Integer> integerList = list.stream().sorted(compare).toList();
        System.out.println(integerList);


        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);


    }
}

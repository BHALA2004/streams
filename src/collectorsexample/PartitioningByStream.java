package collectorsexample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","o","three","four","five");

        Map<Boolean, List<String>> collect = list.stream().collect(Collectors.partitioningBy(str -> str.length() > 2));
        System.out.println(collect);

        Map<Boolean, Long> collect1 = list.stream()
                .collect(Collectors.partitioningBy(str -> str.length() > 3, Collectors.counting()));
        System.out.println(collect1);


    }
}

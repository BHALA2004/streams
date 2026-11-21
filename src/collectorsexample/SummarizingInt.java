package collectorsexample;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingInt {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,1,6,2,8,1,0);
        IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getAverage());
        System.out.println(collect.getSum());
        System.out.println(collect.getCount());

    }
}

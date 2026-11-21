package collectorsexample;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectionCountingStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","two","three","four","five");


        Supplier<TreeSet<String>> supplier = () -> new TreeSet<>();
        supplier.get();

        //Change into a Set and collected it
        TreeSet<String> collect = list.stream().collect(Collectors.toCollection(supplier));

        System.out.println(collect);

        Long collect1 = list.stream().collect(Collectors.counting());
        System.out.println(collect1);





    }
}

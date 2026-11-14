package seleniumexpressvideo3;

import java.util.stream.Stream;

public class StreamSortReverseOrder {
    public static void main(String[] args) {

        //Stream.of(5,4,3,2,1).sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));

        Stream.of(3,1,5,2,7,6)
                .filter(n -> n>=5)
                .map(n -> n*10)
                .sorted()
                .forEach(s -> System.out.println(s));

    }

}

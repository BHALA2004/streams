package seleniumexpressvideo3;

import java.util.stream.Stream;

public class StreamDistinctAndSkip {
    public static void main(String[] args) {

        Stream.of(3,4)
                .skip(1)
                .distinct()
                .forEach(n -> System.out.println(n));


    }

}

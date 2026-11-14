package seleniumexpressvideo3;

import java.util.stream.Stream;

public class StreamsSort {
    public static void main(String[] args) {
        Stream.of(10,4,2,6,7,1,8,9,3,5).sorted().forEach(n-> System.out.println(n));

        Stream.of("Abhi","Aasha","vish","Bala").sorted().forEach(n-> System.out.println(n));


    }
}

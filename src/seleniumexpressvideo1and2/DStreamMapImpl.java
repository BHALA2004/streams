package seleniumexpressvideo1and2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DStreamMapImpl {
    public static void main(String[] args) {


        //Map Intermediate Method is used to Transform a existing Data ,existing Stream into a new Data ,new Stream
        //Intermediate Operation -> definitely Return a Stream data type
        //Terminal Operation -> definitely may or may not doesn't return anything
        //Important -> Terminal Operation Only triggers the stream pipeline so if you doesn't write terminal operation on code means whole stream won't run , thats why streams are lazy in java
        //After Terminal Operation -> Previous Streams are removed from memory

        Stream.of(1, 2, 3, 4, 5, 6)
                .peek(value -> System.out.println("Process Value : " + value))
                .filter(value -> {
                    System.out.println("Check Value : " + value);
                    return value > 2;
                })
                .map(value -> {
                    System.out.println("Transform Value " + value);
                    switch (value) {
                        case 1:
                            return "One";
                        case 2:
                            return "Two";
                        case 3:
                            return "Three";
                        case 4:
                            return "Four";
                        case 5:
                            return "Five";
                    }
                    return "Waste";
                })
                .collect(Collectors.toList())
                .forEach(i -> {
                    System.out.println("Condition Matched " + i);
                });

    }
}
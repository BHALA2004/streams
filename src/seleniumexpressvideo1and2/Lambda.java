package seleniumexpressvideo1and2;

import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {

//        How to use Lambda Function ->
//                1.if a method receives no param () used or no need
//                2.if the implementation more than one line -> {} need
//                3.In Param No need to mention the datatype
//                4.Return Type also no need its take from Stream Data Type for single line code only
//                5.Mention return type if code is more than 1 line


         Stream.of(1, 2, 3, 4, 5)
                .forEach(i -> System.out.println(i));
        Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i>6);


         Stream.of("Bala","Alagu","Aishwarya").forEach(str -> System.out.println(str));

    }
}
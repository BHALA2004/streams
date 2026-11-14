package seleniumexpressvideo1and2;

import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
       Stream<String> stream =  Stream.generate(()->"Bala");
       stream.limit(5).forEach(val -> System.out.println(val));
    }
}


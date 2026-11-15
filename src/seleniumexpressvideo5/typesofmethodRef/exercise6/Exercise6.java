package seleniumexpressvideo5.typesofmethodRef.exercise6;

import java.util.function.Consumer;

public class Exercise6 {
    public static void main(String[] args) {

        //Method Reference Useful only for referring Methods not changing its behaviour

        Consumer<String> consumer = System.out::println;
        consumer.accept("Bala");

    }
}

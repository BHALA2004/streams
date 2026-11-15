package seleniumexpressvideo5.typesofmethodRef.exercise5;

import java.io.PrintStream;
import java.util.function.BiConsumer;

public class AnotherExampleOfOrbitaryObjectImpl {
    public static void main(String[] args) {

        //Another Example for Orbitary Object Implementation

        BiConsumer<PrintStream,String> biConsumer = PrintStream::println;
        System.err.print("Just Watch - ");
        biConsumer.accept(new PrintStream(System.out),"Bala is Working");

    }
}

package seleniumexpressvideo1and2;

import java.util.stream.Stream;

public class OrderOfExecution {
    public static void main(String[] args) {


        //Stream Process the value one by one
        //Not take whole Data structure(Arrays,Collections) to process
        //Stream isn't a DS , so stream not stored anything
        //Stream take the value from any DS and process Data
        //Stream is Immutable
        //If any intermediate action happen on previous stream means it creates a new stream and store existing not modify the existing stream

         Stream.of(1, 2, 3, 4, 5)
                 .peek(value -> System.out.println("Process Value : "+value))
                 .filter( value -> {
                     System.out.println("Check Value : "+value);
                     return value > 2;
                 })
                .forEach(i -> {
                    System.out.println("Condition Matched "+i);
                });

    }
}
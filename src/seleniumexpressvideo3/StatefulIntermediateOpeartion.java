package seleniumexpressvideo3;

import java.util.stream.Stream;

public class StatefulIntermediateOpeartion {
    public static void main(String[] args) {

        //Stateless means
        //1.Does not remember anything -> just process the data and given to next pipeline of a stream


        System.out.println("----------------------------");
        //Stateless Intermediate Operation
        Stream.of(10,4,2,6,7,1,8,9,3,5)
                .filter( n -> {
                    System.out.println("Check Element - "+n);
                    return n >=2;
                })
                .peek(value -> System.out.println(value))
                .forEach(value -> System.out.println(value));

        System.out.println("-------------------------------------");

        //Stateful General Meaning -> Remember something
        //Here Stateful means
        //1.Remembers state of an element in a stream (like we process this or not) and stores the stream obj as temporary one
        //2.example sorted -> entire input all elements should be remembered and sorted before producing a result

        //StateFul Intermediate Operation
        Stream.of(10,4,2,6,7,1,8,9,3,5)
                .filter( n -> {
                    System.out.println("Check Element - "+n);
                    return n >=2;
                })
                .sorted()
                .peek(value -> System.out.println(value))
                .forEach(value -> System.out.println(value));

        System.out.println("---------------------------------------");

        //Short Circuit Stateful Intermediate Operation
        //it remembers data and terminate stream pipeline
        //example limit method : once limit reached , it stops the pipeline even though we may have more data available

        Stream.generate(() -> "Bala")
                .limit(5)
                .forEach(str -> System.out.println(str));

    }
}

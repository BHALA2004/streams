package seleniumexpressvideo1and2;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       /* Stream -> Water Stream Real Life Analogy
        Like Stream Data (Arrays, Collection)  -> process -> Transform
        Take Each Element From Data -> Go to a pipeline -> Process -> Transform
        Why Streams have Code Readability -> Maximum Stream PipeLine Methods take a param as Functional Interface and use that method,
                so FI implementation done by Lambda -> so Streams have more code Readability
                */

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "Bala";
            }
        };
        Consumer<Integer> consumer = (new Consumer<>() {
            @Override
            public void accept(Integer o) {
                System.out.println("Print value : " + o);
            }
        });
        Consumer<Integer> consumer1 = (o -> System.out.println(o));
//      Stream<String> streams = Stream.generate(supplier);
//      streams.forEach(consumer);
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(consumer);

    }
}
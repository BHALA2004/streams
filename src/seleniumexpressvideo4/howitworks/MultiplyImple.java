package seleniumexpressvideo4.howitworks;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class MultiplyImple {

    public static void main(String[] args) {

        // First bifunction.apply Called (Line no 11) -> then that calls transform method (Line no 10 RHS)
        BiFunction<Integer,Integer,Integer> biFunction = MultiplyImple::transform;
        System.out.println("Multiplied Value - "+biFunction.apply(10,10));


        BiPredicate<String , String > biPredicate = Objects::equals;
        System.out.println(biPredicate.test("Bala","Bala"));

    }

    public static int transform(int a ,int b){
        return a * b;
    }
}

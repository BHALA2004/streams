package seleniumexpressvideo3;

import java.util.stream.Stream;

public class StreamTakeWhile {
    public static void main(String[] args) {


        //Take While also example of Short circuiting Intermediate Operation
        //It also terminate a Stream pipeline if the condition doessn't matches
        Stream.of(3,1,5,2,7,6)
                .takeWhile(n -> n>=5)
                .map(n -> n*10)
                .forEach(s -> System.out.println(s));

    }

}

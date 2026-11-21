package collectorsexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","two","three","four","five",",");

        //Normal Joining
        String collect = list.stream()
                .collect(Collectors.joining());

        System.out.println(collect);

        CharSequence charSequence = ",";

        //Joining With Suffix
        String collect1 = list.stream().collect(Collectors.joining(charSequence));
        System.out.println(collect1);

        //Joining With Delimiter , Prefix and Suffix but after the whole String is created
        //Ans ->  -one,two,three,four,five,,-
        String collect2 = list.stream()
                .collect(Collectors.joining(",", "-", "-"));
        System.out.println(collect2);

    }
}

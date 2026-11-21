package collectorsexample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListSetMapExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","two","three","four","five");

        //To List
        System.out.println(list.stream()
                .filter(s -> s.length()>3)
                .collect(Collectors.toList()));

        //To Set
        System.out.println(list.stream()
                .filter(s -> s.length()>3)
                .collect(Collectors.toSet()));

        System.out.println();

        //To Map With Collision
        Map<Integer, String> collect1 = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toMap(String::length, String::toUpperCase));

        System.out.println(collect1);

        //To Map Without Collision
        Map<Integer, String> collect = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toMap(String::length, String::toUpperCase, (str1, str2) -> str1 + " - " + str2));

        System.out.println(collect);

    }
}

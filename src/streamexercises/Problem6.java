package streamexercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("Bala","Vijay");
         str.stream()
                .map(String::toUpperCase);



    }
}

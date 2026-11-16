package seleniumexpressvideo5.typesofmethodRef.exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamSamplePrgm {
    public static int k = 1;
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Arun",
                "Bala",
                "Karthik",
                "Vijay",
                "Praveen",
                "Suresh",
                "Rahul",
                "Ajith",
                "Dinesh",
                "Surya"
        );

        names.stream()
                .map(Employee::new)
                .map(employee -> {
                    employee.setId(k);
                    k++;
                    return employee;
                })
                .map(Employee::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

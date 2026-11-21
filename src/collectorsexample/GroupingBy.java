package collectorsexample;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one","o","three","four","five");

        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

        Map<Integer, Set<String>> collect1 = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));

        System.out.println(collect1);

        List<Employee> employees = Arrays.asList(new Employee(1,"bala"),new Employee(2,"bala"),new Employee(3,"sanjay"));
        TreeMap<String, Long> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getName, TreeMap::new, Collectors.counting()));
        System.out.println(collect2);


    }
}

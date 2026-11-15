package seleniumexpressvideo5.typesofmethodRef.exercise7;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //No Args
        Supplier<Employee> supplier = Employee::new;
        Employee noArgsEmployee = supplier.get();
        System.out.println(noArgsEmployee);

        //Single Args
        Function<Integer,Employee> function = Employee::new;
        Employee singleArgsEmployee = function.apply(10);
        System.out.println(singleArgsEmployee);

        //Single Args
        Function<String,Employee> singleArgsEmployeeAnother = Employee::new;
        Employee singleArgsEmployeeObject = singleArgsEmployeeAnother.apply("Bala");
        System.out.println(singleArgsEmployeeObject);

        //All Args Args
        BiFunction<Integer,String,Employee> allArgs = Employee::new;
        Employee allArgsObject = allArgs.apply(11,"Bala");
        System.out.println(allArgsObject);

    }
}

package seleniumexpressvideo5.typesofmethodRef.exercise4;

import java.util.function.Function;

public class UpperCaseExample {
    public static void main(String[] args) {

//        The Tricky Question Answer here ,
//        Question 1 : how the non-static method is called by class name
//        Answer     : it's not about class name , it's done by orbitary object implementation so Class name is replaced by Orbitary Object as 1st Argument
//        Question 2 :how the method with no args but while calling we send one arg it error ?
//        Answer     :Because 1st arg is treated as Orbitary Object not a input argument

        Function<String,String> function = String::toUpperCase;
        String result = function.apply("bala");
        System.out.println(result);

    }
}

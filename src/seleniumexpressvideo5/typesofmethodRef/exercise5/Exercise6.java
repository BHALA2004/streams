package seleniumexpressvideo5.typesofmethodRef.exercise5;

public class Exercise6 {
    public static void main(String[] args) {

        //The Orbitary Object came as First Arg or Second One that's depend on how we design Functional Interface

        Trifunction<Exercise6,Integer,Integer,Integer> biFunction = Exercise6::sum;
        int result = biFunction.suming(new Exercise6(),10,20);
        System.out.println(result);

    }

    int sum(int a ,int b){
        return a+b;
    }
}

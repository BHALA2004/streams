package seleniumexpressvideo5.typesofmethodRef.exercise3;

public class SumImpl {
    public static void main(String[] args) {

        // Syntax :
        //Need to declare the object as First Argument in Abstract method and Provide Object as First Argument in Concrete Method

        Sum sum = SumImpl::addSumNonStatic;   // SumImpl Class Name replaced by SumImpl Object -> SumImpl::addSumNonStatic becomes new SumImpl().addSumNonStatic(10,10)
        int result = sum.add(new SumImpl(),10,10);
        System.out.println("Non Static Method Ref Call Another Way - "+result);

    }

    //Non Static Example
    int addSumNonStatic(int a, int b) {
        return a + b;
    }
}

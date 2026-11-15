package seleniumexpressvideo5.typesofmethodRef.exercise2;

public class SumImpl {
    public static void main(String[] args) {
        Sum sum = SumImpl::addSum;
        int staticResult =  sum.add(10,10);
        System.out.println("Static  - "+staticResult);

        Sum sum1 = new SumImpl()::addSumNonStatic;
        int nonStaticResultWay1 = sum1.add(10,10);
        System.out.println("Non Static Result 1 - "+nonStaticResultWay1);





    }

    //Static Example
    static int addSum(int a ,int b){
        return a+b;
    }

    //Non Static Example
    int addSumNonStatic(int a ,int b){
        return a+b;
    }
}

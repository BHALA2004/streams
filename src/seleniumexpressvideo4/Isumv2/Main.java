package seleniumexpressvideo4.Isumv2;

public class Main {
    public static void main(String[] args) {
//        Isumv2 isumv2 = Integer::sum;
//        isumv2.display(1,2);
        Isumv2 isumv2 = Main::print;
        isumv2.display(1, 2);
    }

    //While Replaced with method should focus on Arguments not Return type
    //When Return Type Matters ? if Abstract method has a return type of int rather than void but concrete method may return a void leads to compile time error
    public static int print(int a, int b) {
        System.out.println(a + " - " + b);
        return 0;
    }
}

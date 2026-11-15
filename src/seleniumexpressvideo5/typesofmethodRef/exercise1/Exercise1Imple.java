package seleniumexpressvideo5.typesofmethodRef.exercise1;

public class Exercise1Imple {
    public static void main(String[] args) {

        Exercise1 exercise1 = Exercise1Imple::add;


    }
    static int add(int a , int b){
        return a+b;
    }

    static int threeAdd(int  a ,int b ,int c){
        return a+b+c;
    }
}


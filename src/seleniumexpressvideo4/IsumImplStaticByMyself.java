package seleniumexpressvideo4;

public class IsumImplStaticByMyself {

    public static void main(String[] args) {
        Isum isum = IsumImplStaticByMyself::addition;
        System.out.println(isum.add(10,10));

    }

    public static int addition(int a,int b){
        return a+b;
    }

}

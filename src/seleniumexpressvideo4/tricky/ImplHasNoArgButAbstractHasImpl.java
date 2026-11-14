package seleniumexpressvideo4.tricky;

public class ImplHasNoArgButAbstractHasImpl {
    public static String value = "bala";

    public static void main(String[] args) {

        ImplHasNoArgButAbstractHas implHasNoArgButAbstractHas = String::toUpperCase;
        System.out.println(implHasNoArgButAbstractHas.toUpper(value));

//        ImplHasNoArgButAbstractHas implHasNoArgButAbstractHas = ImplHasNoArgButAbstractHasImpl::upper;
//        System.out.println(implHasNoArgButAbstractHas.toUpper(value));
    }

    public static String upper() {
        return "BALA";
    }

}

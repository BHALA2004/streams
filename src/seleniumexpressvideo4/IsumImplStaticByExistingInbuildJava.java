package seleniumexpressvideo4;

public class IsumImplStaticByExistingInbuildJava {

    public static void main(String[] args) {

        /*
        Single Line Lambda is Replaced by Method Reference
        */

        Isum isum = Integer::sum;

        /*
         This is how the implementation will be for above one
         Isum isum = (a,b) -> {
         return Integer.sum(a,b);
         };
         **/

        System.out.println(isum.add(10, 10));

    }

}

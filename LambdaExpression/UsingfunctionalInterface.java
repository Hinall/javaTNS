//package TNSjava.LambdaExpression;
//import java.util.function.Consumer;
//
//
//
//class display{
//
//    static void show()
//    {
//        System.out.println("**********");
//    }
//}
//public class UsingfunctionalInterface {
//
//    public static void main(String[] args) {
//
//        // Consumer Functional Interface
//
//        Consumer<String> con = (str) -> {
//            System.out.println("Welcome" + str);
//        };
//
//        con.accept("Nayna");
//        con=display::show;
//        con.accept("dhyey");
//
//        con=System.out::println;
//        con.accept("dhyey");
//    }
//}

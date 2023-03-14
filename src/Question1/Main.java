package Question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<String> con = a -> System.out.println(a) ;
        con.accept("consumer") ;

        Supplier<String> sup = () -> "supplier" ;
        System.out.println(sup.get());

        Predicate<Integer> p = e -> e > 10 ;
        System.out.println(p.test(8)) ;

        Function<Integer , Integer> f = x -> x*30 ;
        System.out.println(f.apply(5)) ;


    }
}

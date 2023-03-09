import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question5 {

    public static Optional<Integer> func(){
        Integer a = 5 ;
        Optional<Integer> optional = Optional.ofNullable(a) ;

        return optional ;
    }
    public static void main(String args[]){
        Optional<Integer> ans = func() ;
        ans.ifPresentOrElse(System.out::println , () -> System.out.println("No Value Found"));

        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9) ;

        al.stream()
                .filter(e -> e > 8)
                .findFirst()
                .or(() -> Optional.of(-1))
                .ifPresentOrElse(System.out::println , () -> System.out.println("Value not fouond"));

        al.stream()
                .filter(e -> e > 10)
                .findFirst()
                .orElseThrow() ;

    }

}

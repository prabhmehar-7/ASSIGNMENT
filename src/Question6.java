import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Question6 {

    public static void main(String args[]){
        List<Integer> al = List.of(1,2,3,3,4,5,9,6,7,6,10,6,6) ;

        al.stream()
                .filter(e -> e > 7)
                .findFirst()
                .stream()
//                .forEach(System.out::println);
                .mapMulti((number , consumer) -> IntStream.rangeClosed(1,10)
                .forEach(e -> consumer.accept(e*number)))
                .forEach(System.out::println);


    }

}

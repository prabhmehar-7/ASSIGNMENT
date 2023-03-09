import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question9 {

    public static void main(String args[]){
        Stream<Integer> al = Stream.of(1,2,3,4,5,6,7,8,9) ;

        List<Integer> l = al.collect(Collectors.toUnmodifiableList());

        System.out.println(l) ;

    }

}

import java.util.stream.IntStream;

public class Question3 {

    public static void main(String args[]){
        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);
    }

}

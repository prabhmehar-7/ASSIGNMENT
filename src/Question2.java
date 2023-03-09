import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static void main(String args[]) {
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Take While");
        al.stream()
                .takeWhile(e -> e < 5)
                .forEach(e -> System.out.println(e));

        System.out.println();

        System.out.println("Drop While");
        al.stream()
                .dropWhile(e -> e < 5)
                .forEach(e -> System.out.println(e));
    }
}

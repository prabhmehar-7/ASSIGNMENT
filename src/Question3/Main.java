package Question3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){
        List<Integer> al = new ArrayList<>() ;
        al.add(5) ;
        al.add(8) ;
        al.add(7) ;
        al.add(3) ;
        al.add(2) ;
        al.add(1) ;

        int ans = al.stream()
                .filter(x -> x > 5)
                .reduce(0,(total , e) -> total+e) ;

        System.out.println(ans) ;
    }

}

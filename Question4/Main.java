package Question4;

import java.util.Optional;

public class Main {

    public static Optional<String> getString(){
        String str = "abc" ;
        return Optional.ofNullable(str) ;
    }

    public static void main(String args[]){
        Optional<String> str = getString() ;
        System.out.println(str.isPresent());
    }

}

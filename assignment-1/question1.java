import java.util.* ;
import java.io.* ;

public class question1 {
    public static class pair{
        String firstName = "To The New" ;
        String lastName = "Noida" ;
        int age = 15 ;

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder() ;
            sb.append("firstName : " + firstName + "\n") ;
            sb.append("lastName : " + lastName + "\n") ;
            sb.append("age : " + age) ;

            return sb.toString() ;

        }

    }

    public static void main(String args[]){
        pair p = new pair() ;
        System.out.println(p) ;
    }

}

import java.util.* ;
import java.io.* ;

public class question4{

    public static class Pair{
        int data = 0 ;
        String str = "KK" ;

        // Pair(int data , String str){
        //     this.data = data ;
        //     this.str = str ;
        // }

        // Pair(int data){
        //     this(data , "") ;
        // }

        // Pair(){}

        public void initialize(int data){
            this.data = data ;
        }

        Pair(){
            initialize(0) ;
        }

        Pair(int data){
            initialize(data) ;
        }

        private void dataNotDefinedException() throws Exception {
            if(this.data == 0)
                throw new Exception(" dataNotDefinedException : -1 ") ;
        }
    }

    public static void main(String args[]) throws Exception{
        Pair p = new Pair(5) ;
        p.dataNotDefinedException() ;
        System.out.println(p.data) ; 
    }

    

} 
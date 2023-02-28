import java.util.* ;
import java.io.* ;

public class question2 {

    public static Scanner scn = new Scanner (System.in) ;

    public static void main(String args[]){
        infinite() ;
    }

    public static void infinite(){
        while(true){
            System.out.println("Enter the value : ") ;
            String inp = scn.nextLine() ;
            if(inp.equals("XDONE")){
                System.out.println("You have exited!!") ;
                break ;
            }
        }
    }
}

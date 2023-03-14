import java.util.* ;
import java.io.* ;

public class Question2 {
    public static void main(String args[]) throws Exception{
        Scanner scn = new Scanner (System.in) ;
        int n = scn.nextInt() ;

        try{
            if(n == 9)
                System.out.println("try1 block") ;
        }catch(ArithmeticException e1){
            e1.printStackTrace() ;
        }catch(NumberFormatException e2){
            // e2.printStackTrace() ;
            System.out.println("hgfah") ;
        }catch(Exception e){
            System.out.println("jhbas") ;
        }finally{
            System.out.println("Exited") ;
        }
    }
}

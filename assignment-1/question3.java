import java.util.* ;
import java.io.* ;

public class question3 {

    static double circumference = 0 ;
    static double area = 0 ;

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in) ;

        System.out.println("*******Menu*******") ;
        System.out.println("Calculate Area of Circle") ;
        System.out.println("Calculate Circumference of a Circle") ;
        System.out.println("Exit") ;

        System.out.print("Enter Your Option : ") ;
        int c = scn.nextInt() ;

        switch(c){
            case 1 : System.out.print("Enter The Radius : ") ;
                double radius = scn.nextDouble() ;
                area = 3.14*radius*radius ;
                System.out.println(area) ;
                break ;

            case 2 : System.out.print("Enter The Radius : ") ;
                double r = scn.nextDouble() ;
                circumference = 2*3.14*r ;
                System.out.println(circumference) ;
                break ;

            case 3 : System.out.println("Exited sucessfully") ;

        }
    }

}

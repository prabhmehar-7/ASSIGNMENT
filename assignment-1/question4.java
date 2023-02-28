import java.io.* ;
import java.util.* ;

public class question4 {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in) ;
        System.out.print("Enter number of rows : ") ;
        int n = scn.nextInt() ;
        System.out.println() ;
        System.out.print("Enter number of cols : ") ;
        int m = scn.nextInt() ;

    int arr[][] = new int[n][m] ;

    System.out.println("Enter values of array : ") ;

        for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            arr[i][j] = scn.nextInt() ;
        }
    }

    int sum = 0 ;

        for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            sum += arr[i][j] ;
        }
        System.out.println(sum) ;
        sum = 0 ;
    }

        for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            sum += arr[j][i] ;
        }
        System.out.println(sum) ;
        sum = 0 ;
    }
    }

}

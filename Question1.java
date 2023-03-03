import java.util.* ;
import java.io.* ;

public class Question1 {
    enum housing{
        bunglow(200000000) , appartment(675123363) , flat(78873613) ;

        public int price = 0 ;
        housing(int price){
            this.price = price ;
        }

        public double getPrice(){
            return this.price ;
        }
    }
    public static void main(String args[]){
        for(housing h : housing.values()){
            System.out.println(h + " " + h.getPrice()) ;
        }
    }


}

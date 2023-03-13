package Question1;

import java.util.* ;
import java.util.Iterator;

public class Main {
    public static void list_helper(){
        List<Float> al = new ArrayList<Float>() ;
        al.add(4f) ;
        al.add(7883f) ;
        al.add(9937f) ;
        al.add(6.39f) ;
        al.add(7.5f) ;

        float ans = 0 ;
//        for(float f : al){
//            ans += f ;
//        }
//        System.out.println(ans);

        Iterator iterator = al.iterator() ;

        while(iterator.hasNext()){
            ans += (float)iterator.next() ;
        }

        System.out.println(ans) ;

    }

    public static void main(String args[]){
        list_helper() ;
    }
}

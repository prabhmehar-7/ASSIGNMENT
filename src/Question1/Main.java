package Question1;

interface A{
    private void show(){
        System.out.println("private method of the interface") ;
    } ;

    default void caller(){
        show() ;
    }
}

public class Main {
    public static void main(String args[]){
        A objA = new A(){} ;
        objA.caller() ;
    }
}

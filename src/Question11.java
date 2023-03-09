record A(String name , int age) {
    static int count = 0 ;
    void counter(){
        count++ ;
    }
    A{
        counter();
    }

}

public class Question11 {

    public static void main(String[] args) {
        A obj = new A("Mehar" , 22) ;
        A obj1 = new A("Nitin" , 22) ;
        A obj2 = new A("Pranshu" , 22) ;

        System.out.println(A.count);

    }

}

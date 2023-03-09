sealed class Parent permits ChildA {
    public void display(){
        System.out.println("This is Parent");
    }
}

non-sealed class ChildA extends Parent{
    public void dis(){
        display();
    }
}

public class Question12 {
    public static void main(String[] args) {
        ChildA obj = new ChildA() ;
        obj.dis();
    }

}

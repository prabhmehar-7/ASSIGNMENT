package Question2;

interface Create {
    default void showDefault(){
        System.out.println("Default Method of an interface");
    }
    static void showStatic(){
        System.out.println("Static Method of an interface");
    }
}
public class Main {
    public static void main(String[] args) {
        Create obj = new Create(){};
        obj.showDefault();
        Create.showStatic();
    }
}

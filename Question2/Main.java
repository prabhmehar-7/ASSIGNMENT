package Question2;

interface create{
    default void showDefault(){
        System.out.println("Default Method of an interface");
    }
    static void showStatic(){
        System.out.println("Static Method of an interface");
    }
}
public class Main {
    public static void main(String[] args) {
        create obj = new create(){};
        obj.showDefault();
        create.showStatic();
    }
}

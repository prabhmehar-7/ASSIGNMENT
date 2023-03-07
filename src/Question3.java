interface worldcup{
    default void myBody(){
        System.out.println("Default is called by world cup");
    }
}
interface argentina extends worldcup {
    default void myBody(){
        System.out.println("Default is called by argentina" );
    }
}
interface brazil extends worldcup{
    default void myBody(){
        System.out.println("Default is called by brazil");
    }
}
public class Question3 implements argentina,brazil{
    public void myBody(){
        System.out.println("Class method is called");
    }
    public static void main(String[] args) {
        Question3 q = new Question3();
        q.myBody();
    }
}
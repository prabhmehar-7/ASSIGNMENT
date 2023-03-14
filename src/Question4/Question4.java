package Question4;

class newCustomException extends Exception{}
public class Question4 {
    public static void main(String[] args) throws newCustomException {
        try{
            throw new newCustomException();
        }catch (newCustomException e){
            System.out.println("Exception occurred");
        }
        System.out.println("Code is executed");
    }
}

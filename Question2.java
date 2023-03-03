import java.util.* ;
import java.io.* ;

public class Question2 {

    public static class user {
        String firstName ;
        String lastName ;
        int age ;
        int phoneNumber ;

        user(String firstName , String lastName , int age , int phoneNumber){
            this.age = age ;
            this.firstName = firstName ;
            this.lastName = lastName ;
            this.phoneNumber = phoneNumber ;
        }

    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in) ;


        while(true){
            System.out.println("Enter user First Name : ") ;
            String fname = scn.next() ;
            System.out.println("Enter user Last Name : ") ;
            String lname = scn.next() ;
            System.out.println("Enter user Age : ") ;
            int age = scn.nextInt() ;
            System.out.println("Enter user Phone Number : ") ;
            int number = scn.nextInt() ;

            user us = new user(fname , lname , age , number) ;

            try{
                BufferedWriter bw=new BufferedWriter(new FileWriter("details.txt",true));
                bw.write(us.toString());
                bw.newLine();
                bw.close();
            }catch(IOException e){
                System.out.println("Unable to write data in file");
            }

            System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
            String inp = scn.next();

            if(inp.equals("QUIT"))
            {
                break;
            }

        }

    }

}

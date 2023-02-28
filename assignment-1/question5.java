import java.util.* ;
import java.io.* ;

public class question5 {

    static class Employee{
        String firstName ;
        String lastName ;
        int age ;
        String designation ;

        Employee(String firstName , String lastName , int age , String designation){
            this.firstName = firstName ;
            this.lastName = lastName ;
            this.age = age ;
            this.designation = designation ;
        }

        Employee(){}

        public void setFirstName(String firstName){
            this.firstName = firstName ;
        }

        public void setLastName(String lastName){
            this.lastName = lastName ;
        }

        public void setAge(int age){
            this.age = age ;
        }

        public void setDesignation(String designation){
            this.designation = designation ;
        }


        @Override
        public String toString(){
            return "Name : " + firstName + " " + lastName + "\nAge : " + age + "\nDesignation : " + designation ;
        }

    }

    public static void main(String args[]){
        Employee emp = new Employee("Jaikanth" , "Shikre" , 32 , "SDE") ;
        System.out.println(emp) ;
    }

}

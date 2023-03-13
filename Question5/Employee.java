package Question5;

public class Employee {
    String fullName;
    Long salary;
    String city;

    Employee(String firstName , String middleName , String lastName , Long salary , String city){
        this.fullName = firstName+" " + middleName+" " + lastName ;
        this.salary = salary ;
        this.city = city ;
    }
}

package Question4;

import java.util.HashMap;

public class Question4 {
    public static class Employee{
        String name ;
        int age ;
        String designation ;

        Employee(String name , int age , String designation){
            this.name = name ;
            this.age = age ;
            this.designation = designation ;
        }
    }

    public static void main(String args[]){
        HashMap<Employee , Integer> map = new HashMap<>() ;
        map.put(new Employee("Jamy",23,"Software Developer"),2000000) ;
        map.put(new Employee("Dave",29,"Senior Software Developer"),7000000) ;
        map.put(new Employee("Kevin",21,"Trainee Software Developer"),100000) ;
    }
}

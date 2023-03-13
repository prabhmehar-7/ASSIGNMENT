package Question2;

import Question2.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sortingSalary implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        if(e1.salary== e2.salary){
            return 0;
        } else if(e1.salary > e2.salary){
            return 1;
        }else {
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> e=new ArrayList<>();
        e.add(new Employee("Pranshu",22,100000));
        e.add(new Employee("Mohit",22,100000));
        e.add(new Employee("Divyanshu",25,300000));
        e.add(new Employee("Yaman",32,200000));
        e.add(new Employee("Rocky",28,150000));

        Collections.sort(e,new sortingSalary());
        for(Employee s:e){
            s.showInfo();
        }
    }
}

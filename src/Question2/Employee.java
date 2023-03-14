package Question2;

public class Employee {
    int age;
    double salary;
    String name;
    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void showInfo(){
        System.out.println("Name: " + name + ", Age: " + age + " and Salary: " + salary);
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public int compareTo(Employee e){
        return this.getName().compareTo(e.getName());
    }
}

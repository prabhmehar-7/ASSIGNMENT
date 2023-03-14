package Question5;

import java.util.* ;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("PrabhMehar" , "Singh" , "Chhabra", 25008997l, "Delhi");
        Employee e2 = new Employee("Pranshu" , "" , "Jain" , 25008997l, "Delhi");
        Employee e3 = new Employee("Nitin" , "" , "Saluja", 2597l, "Noida");
        Employee e4 = new Employee("Sahil" , "" , "Kadiyan", 25008997l, "Gurugram");
        Employee e5 = new Employee("Shubhneet" , "" , "Singh", 8997l, "Delhi");
        Employee e6 = new Employee("Kartik" ,"", "Arora", 2997l, "Delhi");
        Employee e7 = new Employee("Kartik" ,"", "Arora", 2997l, "Delhi");

//    List<Employee> al = Arrays.asList(e1,e2,e3,e4,e5,e6);

        List<Employee> al = new ArrayList<>() ;
        al.add(e1) ;
        al.add(e2) ;
        al.add(e3) ;
        al.add(e4) ;
        al.add(e5) ;
        al.add(e6) ;
        al.add(e7) ;

        Set<String> set = new HashSet<>();
        set = al.stream()
                .filter(e -> e.salary<5000)
                .filter(e -> e.city=="Delhi")
                .map(e-> e.fullName.split(" ")[0])
                .collect(Collectors.toSet());
        System.out.println(set);
    }


}

package classes_and_objects_in_java.encapsulation;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", 24, 40_000.00, "Dallas");

        Employee employee2 = new Employee("Doug", 35, 50_000.00, "New York");

        employee2.raiseSalary();
        System.out.println(employee1.salary);
        System.out.println(employee2.salary);



    }



}

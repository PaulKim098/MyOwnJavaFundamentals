package classes_and_objects_in_java.encapsulation;

public class Employee {

    String name;
    int age;
    double salary;
    String location;

    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(){
         this.salary = this.salary + 20_000;
    }

    static void announceRaise(){
        System.out.println("You got huge raise!");
    }
}

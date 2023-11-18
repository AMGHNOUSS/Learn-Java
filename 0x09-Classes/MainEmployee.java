/*
 * create a class called "Employee" with a name, salary
 * And hire date attributes, and a method to calculate years of service.
 */
import java.time.LocalDate;
import java.time.Period;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Redouane", 5000, LocalDate.parse("2021-04-01"));
        Employee e2 = new Employee("Ahmed", 6000, LocalDate.parse("2019-10-01"));
        e1.print();
        e2.print();
    }
}

class Employee {
    private String name;
    private float salary;
    private LocalDate hiredate;

    public Employee(String n, float s, LocalDate h){
        this.name = n;
        this.salary = s;
        this.hiredate = h;
    }
    public int calculateYearsOfService(){
        return Period.between(hiredate, LocalDate.now()).getYears();
    }
    public void print(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary + " Dollar");
        System.out.println("Number years of service : " + this.calculateYearsOfService() + "\n");
    }
}



/*
 * create a class called Employee with methods called work() and getSalary().
 * Create a subclass called HRManager that overrides the work() method
 * Add a new method called addEmployee().
 */

class Employee {

    private double Salary;

    public Employee(double Salary) {
        this.Salary = Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    protected void work() {
        System.out.println("The employee is working...!");
    }

    protected double getSalary() {
        return this.Salary;
    }
}

class HRManager extends Employee {

    public HRManager(double Salary) {
        super(Salary);
    }

    @Override
    protected void work() {
        System.out.println("The HR Manger is working...!");
    }

    public void addEmployee() {
        System.out.println("Add Employee");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(40000);
        HRManager mgr = new HRManager(70000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}

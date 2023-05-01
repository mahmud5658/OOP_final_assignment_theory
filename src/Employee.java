
//Employee super class which have the following attributes and method.
public abstract class Employee {
    private int employeeID; // unique identifier of an employee
    private String name; // the of the employee
    private double salary;// salary of the employee

    // constructor for assigning value to variables
    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    // get method of employeeID. Tt can return employeeID to other class.
    public int getEmployeeID() {
        return employeeID;
    }

    // get method of name. It can return name to other class.
    public String getName() {
        return name;
    }

    // get method of salary. It can return salary to other class.
    public double getSalary() {
        return salary;
    }

    // toString() method can return the details of employee with string format
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Salary: " + salary + " Tk.";
    }

    // total salary method can sum of all employees salary and return total sum
    public static double totalSalary(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
}


// Administrator subclass
public class Administrator extends Employee {
    private String department; // the department that the administrator work in

    // constructor for assign value
    public Administrator(int employeeID, String name, double salary, String department) {
        super(employeeID, name, salary);
        this.department = department;
    }

    // this method return department
    public String getDepartment() {
        return department;
    }

    //this method override the super class method to include department
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

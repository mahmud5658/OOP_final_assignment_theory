
// Professor subclass
public class Professor extends Employee {
    private String subjectOfExpertise; // subject that the professor expert in

    // constructor for assign value
    public Professor(int employeeID, String name, double salary, String subjectOfExpertise) {
        super(employeeID, name, salary);
        this.subjectOfExpertise = subjectOfExpertise;
    }

    // this method return subjectOfExpertise
    public String getSubjectOfExpertise() {
        return subjectOfExpertise;
    }

    //this method override the super class method to include subjectOfExpertise
    public String toString() {
        return super.toString() + ", Subject of Expertise: " + subjectOfExpertise;
    }
}

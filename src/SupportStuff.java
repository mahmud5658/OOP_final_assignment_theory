
// SupportStuff subclass
public class SupportStuff extends Employee {

    private String jobTitle; // the job title of supportStuff

    // constructor for assign value
    public SupportStuff(int employeeID, String name, double salary, String jobTitle) {
        super(employeeID, name, salary);
        this.jobTitle = jobTitle;
    }

    // this method return jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // this method override the super class method to include the jobTitle
    public String toString() {
        return super.toString() + ", Job Title: " + jobTitle;
    }
}

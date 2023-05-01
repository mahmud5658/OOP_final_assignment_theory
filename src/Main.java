
// this class contain main method
public class Main {
    public static void main(String[] args) {

        // create required object for each class

        Professor professor1 = new Professor(5658, "Abdullah Al Mahmud", 90000.00, "CSE");
        Professor professor2 = new Professor(4827, "Raihan Hossain", 100000.00, "SWE");
        Administrator administrator1 = new Administrator(5688, "Rakibul hassan Akash", 70000.00, "Finance");
        SupportStuff supportStuff1 = new SupportStuff(4652, "Moinul Islam", 60000.00, "IT Support");

        // print the details of each object

        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(administrator1);
        System.out.println(supportStuff1);

        // create an array which store the details of each employee

        Employee[] employees = {professor1, professor2, administrator1, supportStuff1};

        // call totalSalary for calculating the summation of all employee's salary

        double totalSalary = Employee.totalSalary(employees);

        // print the total salary of all employee

        System.out.println("Total salary of all employees: " + totalSalary + " Tk.");
    }
}
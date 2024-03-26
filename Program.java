import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(String dob) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date birthDate = sdf.parse(dob);
            Date currentDate = new Date();
            long diffInMillies = Math.abs(currentDate.getTime() - birthDate.getTime());
            long ageInMillies = diffInMillies / (24 * 60 * 60 * 1000 * 365L);
            System.out.println("Age: " + ageInMillies);
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }
}

class EmployeeDetails extends Person {
    private String empId;
    private double salary;

    public EmployeeDetails(String name, String empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}
 class Program {
    public static void main(String[] args) {
       
        // Creating an instance of the EmployeeDetails class
        EmployeeDetails employee = new EmployeeDetails("John Doe", "EMP123", 50000);
        
        // Displaying employee details
        employee.displayEmployeeDetails();

        // Pushing the changes to a new branch "employee_details"
        // Once the functionalities of "Person" and "EmployeeDetails" class are executed successfully,
        // the new branch should be merged to the "main" branch.
        // This part cannot be automated within this script as it requires interactions with a version control system like Git.
    }
}

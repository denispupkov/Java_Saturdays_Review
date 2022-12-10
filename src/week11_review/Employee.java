package week11_review;

public class Employee extends Person{

    private String employeeId, jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender);
       setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if ( employeeId==null || employeeId.isEmpty() ) {
            System.err.println("Employee cannot be null ot empty");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle==null) {
            System.err.println("Job Title cannot be empty or null");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0) {
            System.err.println("Salary cannot be 0 or negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work () {
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                super.toString()+
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

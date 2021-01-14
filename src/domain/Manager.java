package domain;
public class Manager extends Employee {
/**
 * @see Employee
 * Constructor
 * @param employees employees of Manager
 * @param name name of Manager
 * @param jobTitle jobTitle of Manager
 * @param level level of Manager
 * @param dept dept of Manager
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    /**
     * Method that print information about Employee
     * @return string value 
     */
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
/**
 * Constructor of Manager
 * @param employees employees of Manager
 */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
   /**
    * Constructor of Manager
    */ 
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
/**
 * Return information about Employees
 * @return string value of Manager
 */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Return employees of people
 * @param employees employees of Manager
 */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
/**
 * Return employees of people
 * @return array string value of Manager
 */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}

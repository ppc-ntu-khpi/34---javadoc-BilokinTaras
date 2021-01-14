package domain;
public class Employee {
    
    @Override
    /**
     * Method that return information about Employee
     * @return string value about skills of Employee
     */
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
/**
 * Constructor 
 * @param name name of worker
 * @param jobTitle jobTitle of worker
 * @param level level of worker
 * @param dept dept of worker
 */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
/**
 * Set ID worker in random ways
 */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
/**
 * Method that save jobTitle in job 
 * @param job string value of people 
 */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
/**
 * Return jobTitle of people
 * @return string value of people
 */
    public String getJobTitle() {
        return jobTitle;
    }
/**
 * Return name of people
 * @return string value of people
 */
    public String getName() {
        return name;
    }
/**
 * Method that save level of Employee
 * @param level integer value about Employee
 */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 * Return level of people
 * @return integer value of people
 */
    public int getLevel() {
        return level;
    }
/**
 * Return dept of dept
 * @return string value of people
 */
    public String getDept() {
        return dept;
    }
/**
 * Return dept of people
 * @param dept string value of people
 */
    public void setDept(String dept) {
        this.dept = dept;
    }
/**
 * Set name of Employee
 * @param name string value of Employee
 */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}

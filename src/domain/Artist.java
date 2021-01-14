package domain;

/**This class represent a people with skills 
 * @see Employee
 * @author Taras
 */
public class Artist extends Employee {
/**
 * Constructor people
 * @param skiils skills people
 * @param name name people
 * @param jobTitle jobTitle people
 * @param level level people
 * @param dept dept people
 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
/**
 *  Constructor
 * @param skiils skills people
 */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Constructor of Artist
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    
    /**
     * Method that print skills Artist
     * @return String with skills Artist
     */
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
/**
 * Print informating about Artist
 * @return string value of people
 */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Save skills of Artist
 * @param skills skills of Artist
 */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
/**
 * Method that return skills people
 * @return array string with skills 
 */
    public String[] getSkillsLSist() {
        return skiils;
    }
}

package domain;
public class Editor extends Artist {
/**
 * @see Artist
 * Constructos of Editor
 * @param electronicEditing electronicEditing of editor
 * @param skiils skills of Editor
 * @param name name of Editor
 * @param jobTitle jobTitle of Editor
 * @param level level of Editor
 * @param dept dept of Editor
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
 * Constructor
 * @param electronicEditing electronicEditing of people
 * @param skiils skills of people
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
/**
 * Constructor
 * @param electronicEditing electronicEditing of people 
 */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
  /**
   * Constuctor of people
   */  
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    /**
     * Print informating of Editor
     */
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
/**
 * Method that return electronicEditing
 * @return boolean value of Editor
 */
    public boolean getPreferences() {
        return electronicEditing;
    }
/**
 * Method that save electronicEditing in electronic
 * @param electronic 
 */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}

package studentlist;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String sname;
    private String sID;
// This has been added to github.com to shoe fetch+merge.
    public Student(String sname, String sID) {
        this.sname = sname;
        this.sID = sID;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
    
    
    
}

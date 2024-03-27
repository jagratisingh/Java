package Filehandling2;

import java.io.Serializable;

public class Name implements Serializable {
    private String fname;
    private String mname;
    private String lname;
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getMname() {
        return mname;
    }
    @Override
    public String toString() {
        return "Name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getLname() {
        return lname;
    }
    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    
}

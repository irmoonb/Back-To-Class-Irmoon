public class Senior extends HighSchoolStudent {
    // something new
    private boolean myCommitted;

    // constructor
    public Senior(String name, int age, String gender, String idNum, double gpa, String academy, int year, boolean committed) {
        super(name, age, gender, idNum, gpa, academy, year);
        myCommitted = committed;
    }

    // getter
    public boolean getCommitted() {
        return myCommitted;
    }

    // setter
    public void setCommitted(boolean committed) {
        myCommitted = committed;
    }

    @Override
    public String toString()
    {
        String status = myCommitted ? "is committed" : "is not committed";
        return "Senior: " + super.toString() + " college committed status: " + status;
    }

    public String status()
    {
        if (myCommitted)
        {
            return getName() + " is committed for a college";
        }
        else
        {
            return getName() + " is not committed for a college";
        }
    }

}

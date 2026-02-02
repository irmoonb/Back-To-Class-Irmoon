public class Freshman extends HighSchoolStudent {
    // something new
    private String myCtePathway;

    // constructor
    public Freshman(String name, int age, String gender, String idNum, double gpa, String academy, int year, String ctePathway) {
        super(name, age, gender, idNum, gpa, academy, year);
        myCtePathway = ctePathway;
    }

    // getter
    public String getCtePathway()
    {
        return myCtePathway;
    }

    // setter
    public void setCtePathway(String ctePathway)
    {
        myCtePathway = ctePathway;
    }

    // override
    @Override
    public String toString()
    {
        return "Freshman: " + super.toString() + " CTE Pathway: " + myCtePathway;
    }

    public String CTEPrint()
    {
        return getName() + " is a part of the introductory class for " + myCtePathway;
    }
}
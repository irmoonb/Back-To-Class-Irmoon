public class HighSchoolStudent extends Student
{
    private String myAcademy;
    private int myYear;

    // constructor
    public HighSchoolStudent(String name, int age, String gender, String idNum, double gpa, String academy, int year)
    {
        // use the super class' constructor
        super(name, age, gender, idNum, gpa);
        // initialize what's new to HighSchoolStudent
        myAcademy = academy;
        myYear = year;
    }

    // getters
    public String getAcademy()
    {
        return myAcademy;
    }

    public int getYear()
    {
        return myYear;
    }

    // setters
    public void setAcademy(String academy)
    {
        myAcademy = academy;
    }

    public void setYear(int year)
    {
        myYear = year;
    }

    // toString
    public String toString()
    {
        return super.toString() + ", academy: " +  myAcademy + ", year: " + myYear;
    }
}

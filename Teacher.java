public class Teacher extends Person
{
    protected String mySubject; // subject they teach
    protected double mySalary; // annual salary

    // constructor
    public Teacher(String name, int age, String gender, String subject, double salary)
    {
        // use the super class' constructor
        super(name, age, gender);
        // initialize what's new to Teacher
        mySubject = subject;
        mySalary = salary;
    }

    // getters
    public String getSubject()
    {
        return mySubject;
    }

    public double getSalary()
    {
        return mySalary;
    }

    // setters
    public void setSubject(String subject)
    {
        mySubject = subject;
    }

    public void setSalary(double salary)
    {
        mySalary = salary;
    }

    // toString
    public String toString()
    {
        return super.toString() + ", subject: " +  mySubject + ", salary: " + mySalary;
    }
}

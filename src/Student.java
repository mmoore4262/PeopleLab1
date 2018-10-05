public class Student extends Person
{

    private double gpa;
    private String FirstName,FamilyName;

    /*public GPA (double gpa,String FirstName,String FamilyName)
    {
        super("FirstName","FamilyName");
        this.gpa=gpa;
        this.FamilyName=FamilyName;
        this.FirstName=FirstName;

    }*/

    public Student( String firstName, String familyName)
    {
        super( firstName, familyName);
        this.FirstName=firstName;
        this.FamilyName=familyName;
    }

    public double getGpa()
    {
        gpa= Math.random() * (4 - 0) + 0;
        return gpa;
    }

    @Override
    public String toString() {
        return (FamilyName+FirstName);
    }
}


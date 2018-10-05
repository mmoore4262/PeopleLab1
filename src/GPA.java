public abstract class GPA extends Person {

    private double gpa;
    private String FirstName,FamilyName;

    public GPA(double gpa,String FirstName,String FamilyName)
    {
        super("FirstName","FamilyName");
        this.gpa=gpa;
        this.FamilyName=FamilyName;
        this.FirstName=FirstName;

    }

    public double getGpa()
    {
        return gpa;
    }

    @Override
    public String toString() {
        return (FamilyName+FirstName);
    }
}


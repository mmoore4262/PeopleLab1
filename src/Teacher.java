public class Teacher extends Person
{
    private String subject;
    private String title;
    public Teacher (String Subject, String Title, String familyName, String firstName)
    {
        super(firstName,familyName);
        this.subject = Subject;
        this.title = Title;

    }

    public String getSubject() {
        return this.subject;
    }

    public String getFamilyName(){
        return this.familyName;
    }
    public String toString()
    {
        return (this.title + "." + familyName);
    }
}

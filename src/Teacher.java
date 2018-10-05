public class Teacher extends Person
{
    private String Subject;
    private String Title;
    public Teacher (String Subject, String Title)
    {
        super("Teacher", "dalton");
        this.familyName = familyName;
        this.Subject = Subject;
        this.Title = Title;

    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
    public String toString()
    {
        return Title + "." + familyName;
    }
}

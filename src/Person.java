public abstract class Person {
    String firstName;
    String familyName;

    public Person(String firstName, String familyName)
    {
        this.firstName=firstName;
        this.familyName=familyName;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFamilyName()
    {
        return familyName;
    }
    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }
    public boolean equals(Person person)
    {
        if(this.firstName.equals(person.getFirstName()) && this.familyName.equals(person.getFamilyName()))
        {
            return true;
        }
        else
            {
            return false;
        }
    }
    public abstract String toString();
}



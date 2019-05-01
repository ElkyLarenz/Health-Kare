package Users;

public class Child
{
     private int StudentID, Age;
     private String FirstName, LastName;

     public Child(int studentID, String FirstName, String LastName, int Age)
     {
         this.StudentID = studentID;
         this.FirstName = FirstName;
         this.LastName = LastName;
         this.Age = Age;

     }

    @Override
    public String toString() {
        String bk = (StudentID + " " + FirstName + " " + LastName + " " + Age);
        return bk;
    }

    public int getStudentID()
     {
         return StudentID;
     }
    public int getAge()
    {
        return Age;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
}

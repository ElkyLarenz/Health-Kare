package Users;

public class Staff
{
     private int StudentID, Age;
     private String FirstName, LastName;

     public Staff(int studentID, String FirstName, String LastName, int Age)
     {
         this.StudentID = studentID;
         this.FirstName = FirstName;
         this.LastName = LastName;
         this.Age = Age;

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

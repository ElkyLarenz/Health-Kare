package Function;

public class Staff {
    String fName;
    String lName;
    int id;

    public Staff(String a, String b, int c)
    {
        fName = a;
        lName = b;
        id = c;
        System.out.print(fName + " " + lName + " " + id);


    }

    public String getfName()
    {
        return fName;

    }

    public String getlName()
    {
        return lName;
    }

    public int getId()
    {
        return id;
    }


}


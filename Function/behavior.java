package Function;

public class behavior {
    String type;
    int amount;
    int time;
    String location;
    int staffID;
    String desc;
    String date;

    public behavior(String a, int b, int c, String d, int e, String f, String g)
    {
        type = a;
        amount = b;
        time = c;
        location = d;
        staffID = e;
        desc = f;
        date = g;
    }

    public String getType()
    {
        return type;
    }

    public int getAmount()
    {
        return amount;
    }

    public int getTime()
    {
        return time;
    }

    public String getLocation()
    {
        return location;
    }

    public int getStaffID()
    {
        return staffID;
    }

    public String getDesc()
    {
        return desc;
    }

    public String getDate()
    {
        return date;
    }
}

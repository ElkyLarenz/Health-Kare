package Database;

import java.sql.*;

//maybe use firebase for authentication and my sql for the database
public class test {

    public static void main(String[] args)
    {
        System.out.println();
        /*try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from STAFF");
            while (rs.next())
                System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2)
                        + " Last Name: " + rs.getString(3) + " Age " + rs.getInt(4));
            con.close();
        }   catch (Exception e){System.out.println("Cannot connect the database!" + e);}*/
        retrieveStaff();
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        retrieveBehavSpec();
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        retrieveChildren();
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        retrieveChildAddress();
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        retrieveConflict();


    }

    public static void retrieveStaff()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from STAFF");
            while (rs.next())
                System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2)
                        + " Last Name: " + rs.getString(3) + " Age: " + rs.getInt(4));
            con.close();
        }   catch (Exception e){System.out.println("Cannot connect the database!" + e);}

    }
    public static void retrieveChildren()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from CHILD");
            while (rs.next())
                System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2)
                        + " Last Name: " + rs.getString(3) + " Age: " + rs.getInt(4) + " Date of Birth: " + rs.getDate(5));
            con.close();
        }   catch (Exception e){System.out.println("Cannot connect the database!" + e);}

    }
    public static void retrieveBehavSpec()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from BEHAV_SPEC");
            while (rs.next())
                System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2)
                        + " Last Name: " + rs.getString(3) + " Age: " + rs.getInt(4));
            con.close();
        }   catch (Exception e){System.out.println("Cannot connect the database!" + e);}

    }
    public static void retrieveChildAddress()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select child.child_id, child.Fname, child.Lname, C_ADDRESS.A_line1," +
                    " C_ADDRESS.A_line2, C_ADDRESS.A_line3, C_ADDRESS.City, C_ADDRESS.State, C_ADDRESS.Country, C_ADDRESS.PostalCode " +
                    "from CHILD right join C_ADDRESS ON CHILD.child_id = C_ADDRESS.child_id;\n");
            while (rs.next())
                System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2)
                        + " Last Name: " + rs.getString(3) + " Address line 1: " + rs.getString(4)
                        + " Address line 2: " + rs.getString(5) + " Address line 3: " + rs.getString(6)
                        + " City: " + rs.getString(7) + " State: " + rs.getString(8)
                        + " Country: " + rs.getString(9) + " Postal Code: " + rs.getString(10));
            con.close();
        }   catch (Exception e){System.out.println("Cannot connect the database!" + e);}

    }

    public static void retrieveConflict()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Class410");
            System.out.println("Database connected!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select child.child_id, child.Fname, child.Lname, Conflict.D, Conflict.T, Conflict.Location, Conflict.Behav_type, Conflict.Des \n" +
                    "from CHILD right join Conflict ON CHILD.child_id = Conflict.child_id;");
            while (rs.next())
                System.out.println("ID: " + rs.getInt(1) + " First Name: " + rs.getString(2)
                        + " Last Name: " + rs.getString(3) + " Date: " + rs.getDate(4)
                        + " Time: " + rs.getTime(5) + " Location: " + rs.getString(6)
                        + " Action: " + rs.getString(7) + " Description: " + rs.getString(8));
            con.close();
        }   catch (Exception e){System.out.println("Cannot connect the database!" + e);}

    }

}



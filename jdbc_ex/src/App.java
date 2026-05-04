import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        try
        {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world",
                    "root",
                    "12345"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(
                    "select name from country where population < 50000;"
            );

            // Display Result
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }

            // Close Connection
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
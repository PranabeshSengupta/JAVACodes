import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo
{
    public static void main(String[] args) throws  Exception
    {

        String email1="abc@gmail.com";
        //-------------load driver class-------

        Class.forName("com.mysql.cj.jdbc.Driver");

        //-----------make JDBC connection--------

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");

        PreparedStatement ps=con.prepareStatement("delete from register  where email=?");

        ps.setString(1,email1);
        int i=ps.executeUpdate();
        if (i>0)
        {
            System.out.println(" Data Deleted....");
        }
        else {
            System.out.println("  Failed....");
        }
        con.close();
    }
}

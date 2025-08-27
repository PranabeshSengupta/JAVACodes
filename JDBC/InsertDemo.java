import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo
{
    public static void main(String[] args) throws  Exception
    {
        //-----------USER values------------
        String name1="mousumi";
        String email1="mou@gmail.com";
        String pass1="mou1234";
        String gender1="male";
        String city1="Burdwen";

        //-------------load driver class-------

        Class.forName("com.mysql.cj.jdbc.Driver");

        //-----------make JDBC connection--------

        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");

        //-------------make ps(sql query)------------
        PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");

        // ----------set positional parameter-------

        ps.setString(1,name1);
        ps.setString(2,email1);
        ps.setString(3,pass1);
        ps.setString(4,gender1);
        ps.setString(5,city1);
        int i=ps.executeUpdate();
        if (i>0)
        {
            System.out.println(" Data Inserted....");
        }
        else {
            System.out.println(" Insertion Failed....");
        }
        con.close();
    }
}

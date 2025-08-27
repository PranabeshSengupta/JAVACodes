import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student"; // Replace with your DB name
        String username = "root";
        String password = "123456";

        try {
            // Load MySQL JDBC Driver (not needed in newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

            // Do something with the connection...

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}

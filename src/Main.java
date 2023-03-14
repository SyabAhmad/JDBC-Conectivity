import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "myusername";
        String password = "mypassword";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
            // Perform database operations here
        } catch (SQLException e) {
            System.out.println("Failed to connect to database");
            e.printStackTrace();
        }
    }
}

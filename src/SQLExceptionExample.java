import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/non_existent_db", "user", "password");
        } catch (SQLException e) {
            // Handle the exception
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}

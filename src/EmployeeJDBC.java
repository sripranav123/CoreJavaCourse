import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeJDBC {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Pranav@2006";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to PostgreSQL database!");

            // Ensure the employee table exists
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employee (" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "department VARCHAR(100)" +
                    ")";
            try (Statement stmt = connection.createStatement()) {
                stmt.execute(createTableSQL);
                System.out.println("Table employee verified/created successfully.");
            }

            // Insert an employee
            String insertSQL = "INSERT INTO employee (name, department) VALUES (?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
                pstmt.setString(1, "John Doe");
                pstmt.setString(2, "Engineering");
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new employee was inserted successfully!");
                }
            }

            // Retrieve all employees
            String selectSQL = "SELECT id, name, department FROM employee";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {
                System.out.println("Employees in the table:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String department = rs.getString("department");

                    System.out.println("Employee ID: " + id + ", Name: " + name + ", Department: " + department);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


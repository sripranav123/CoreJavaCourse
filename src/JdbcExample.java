import java.sql.*;

public class JdbcExample {
    private static final String URL="jdbc:postgresql://localhost:5432/postgres";
    private static final String USER="postgres";
    private static final String PASSWORD="Pranav@2006";
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL , USER , PASSWORD)){
            System.out.println("Connected To PostgreSQL DataBase.");
            DatabaseMetaData metaData = connection.getMetaData();
            String[] types={"TABLE"};
            ResultSet rs1=metaData.getTables(null,"public" , "%" , types);
            while(rs1.next()){
                System.out.println(rs1.getString("TABLE_NAME"));
            }



            String selectsql = "Select * from person";
            Statement stmt=connection.createStatement();
            ResultSet rs  = stmt.executeQuery(selectsql);
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                int age=rs.getInt("age");
                System.out.println("Employee id :" +id +"Name :"+name +"age : "+age);
            }
        }
    }
}

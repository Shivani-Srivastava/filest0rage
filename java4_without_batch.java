import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class NoBatchProcessingUpdate {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:your_database_url";
        String user = "your_username";
        String pass = "your_password";
 
        Connection conn = DriverManager.getConnection(url, user, pass);
 
        PreparedStatement pstmt = conn.prepareStatement("UPDATE STUDENTS SET AGE = ? WHERE NAME = ?");
 
        pstmt.setInt(1, 21);
        pstmt.setString(2, "John");
        pstmt.executeUpdate();
 
        pstmt.setInt(1, 23);
        pstmt.setString(2, "Jane");
        pstmt.executeUpdate();
 
        conn.close();
    }
}

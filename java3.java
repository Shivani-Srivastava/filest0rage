import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class BatchProcessing {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:your_database_url";
        String user = "your_username";
        String pass = "your_password";
 
        Connection conn = DriverManager.getConnection(url, user, pass);
        conn.setAutoCommit(false);
 
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO STUDENTS (NAME, AGE) VALUES (?, ?)");
 
        pstmt.setString(1, "John");
        pstmt.setInt(2, 20);
        pstmt.addBatch();
 
        pstmt.setString(1, "Jane");
        pstmt.setInt(2, 22);
        pstmt.addBatch();
 
        int[] updateCounts = pstmt.executeBatch();
        conn.commit();
        conn.close();
    }
}

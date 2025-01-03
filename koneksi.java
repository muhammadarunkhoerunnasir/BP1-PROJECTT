import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    // URL, username, dan password database
    private static final String URL = "jdbc:mysql://localhost:3306/db_hp"; 
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = "";    

    private static Connection conn;

    // Metode untuk mendapatkan koneksi
    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Koneksi berhasil!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

    // Metode main untuk pengujian koneksi
    public static void main(String[] args) {
        Connection testConn = getConnection(); 
        if (testConn != null) {
            System.out.println("Tes koneksi berhasil!");
        } else {
            System.out.println("Tes koneksi gagal!");
        }
    }
}

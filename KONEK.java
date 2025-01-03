import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KONEK {
    // URL, username, dan password database
    private static final String URL = "jdbc:mysql://localhost:3306/db_login"; // Ganti "db_hp" sesuai nama database Anda
    private static final String USERNAME = "root"; // Username MySQL
    private static final String PASSWORD = "";    // Password MySQL (kosong jika default)

    // Objek koneksi
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
        Connection testConn = getConnection(); // Panggil metode getConnection()
        if (testConn != null) {
            System.out.println("Tes koneksi berhasil!");
        } else {
            System.out.println("Tes koneksi gagal!");
        }
    }
}

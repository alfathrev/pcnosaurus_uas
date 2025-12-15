package posa.obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Load driver secara eksplisit (wajib untuk beberapa versi MySQL/JDK)
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/toko_pc?useSSL=false&serverTimezone=UTC";
                String user = "root"; 
                String pass = "12345";

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("✅ Koneksi BERHASIL ke database!");
            } catch (ClassNotFoundException e) {
                System.out.println("❌ Driver tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("❌ Koneksi GAGAL: " + e.getMessage());
            }
        }
        return conn;
    }

    public static void main(String[] args) {
        getConnection();
    }

    public static Connection Go() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

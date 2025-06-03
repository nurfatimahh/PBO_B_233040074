package Pertemuan14.Tugas4;

public class DatabaseConnection {
    public static String connectionString;
    static {
    connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Inisialisasi koneksi database telah dilakukan.");
    }
}
    

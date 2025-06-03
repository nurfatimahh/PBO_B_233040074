package TugasPertemuan11;

//Kelas utama untuk menjalankan program
public class BungaMain {
 public static void main(String[] args) {
     // Membuat objek bunga potong
     Bunga b1 = new BungaPotong();
     Bunga b1a = new BungaPotong();

     // Membuat objek bunga dalam pot
     Bunga b2 = new BungaPot();

     // Menampilkan info dan total harga untuk bunga potong
     b1.tampilkanInfo();
     b1a.tampilkanInfo();
     System.out.println("Total: Rp" + b1.hitungHarga(5)); // 5 tangkai

     // Menampilkan info dan total harga untuk bunga dalam pot
     b2.tampilkanInfo();
     System.out.println("Total: Rp" + b2.hitungHarga(9)); // 9 pot
 }
}

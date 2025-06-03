package TugasPertemuan11;

//Kelas BungaPotong mengimplementasikan interface Bunga
public class BungaPotong implements Bunga {
	 // Atribut nama bunga dan harga per tangkai
	 public String nama;
	 public double harga;

	 // Menampilkan informasi tentang bunga potong
	 public void tampilkanInfo() {
	     System.out.println("Bunga Potong: " + nama);
	 }
	
	 // Menghitung total harga tanpa diskon
	 public double hitungHarga(int jumlah) {
	     return harga * jumlah;
	 }
}


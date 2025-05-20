package TugasPertemuan11;

//Kelas BungaPot mengimplementasikan interface Bunga
public class BungaPot implements Bunga {
	 // Atribut nama bunga dan harga per pot
	 public String nama = "Anggrek";
	 public double harga = 55000;
	
	 // Menampilkan informasi tentang bunga dalam pot
	 public void tampilkanInfo() {
	     System.out.println("Bunga Dalam Pot: " + nama);
	 }
	
	 // Menghitung total harga dengan diskon 10%
	 public double hitungHarga(int jumlah) {
	     return harga * jumlah * 0.9; // Diskon 10%
	 }
}


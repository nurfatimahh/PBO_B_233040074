package TugasPertemuan11;

// Kelas abstrak Tanaman: menjadi dasar bagi semua jenis tanaman
public abstract class Tanaman {
    protected String nama;
    protected double harga;

    // Konstruktor
    public Tanaman(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method abstrak yang wajib diimplementasi oleh subclass
    public abstract void tampilkanInfo();
    public abstract double hitungHarga(int jumlah);
  
}
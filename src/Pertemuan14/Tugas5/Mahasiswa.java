package Pertemuan14.Tugas5;

public class Mahasiswa {
    private final String nim;
    // Variabel nama (String).
    private String nama;

    // Variabel static totalMahasiswa (int) yang menghitung jumlah objek Mahasiswa yang dibuat.
    private static int totalMahasiswa = 0;

    // Constanta static final MAX_SKS (int) yang menyatakan batas maksimum SKS.
    public static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
    }

    // Getter 
    public String getNim() {
        return nim;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //Method untuk menampilkan informasi mahasiswa.
    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Maksimum SKS yang dapat diambil: " + Mahasiswa.MAX_SKS); 
        System.out.println("---------------------------");
    }
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}

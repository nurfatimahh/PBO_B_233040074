package Latihan;

public class Dosen {
	String nama;
	String gelar;
	
	public Dosen() {
	}
	public Dosen(String nama, String gelar) {
		this.nama = nama;
		this.gelar = gelar;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNama() {
		return nama;
	}
	public void setGelar(String gelar) {
		this.gelar = gelar;
	}
	public String getGelar() {
		return gelar;
	}

}
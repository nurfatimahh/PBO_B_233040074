package Pertemuan7;

public class Dosen {
	private String nidn;
	private String Nama;
	
	public Dosen(String nidn, String nama) {
		this.nidn = nidn;
		this.Nama = nama;
	}
	public String getNidn() {
		return nidn;
	}
	public String getNama() {
		return Nama;
	}
	public String display() {
		return "Dosen: " + Nama + " (NIDN: "+ nidn + ")";
	}
}

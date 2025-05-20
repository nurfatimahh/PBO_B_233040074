package Pertemuan11;

// kelas Tabung adalah turunan dari kelas bentuk
public class Tabung extends Bentuk {
	//atribut tinggi tabung
	private int tinggi;
	
	//konstruktor yang memanggil Bnetuk dengan jari2
	public Tabung() {
		super(0);
	}
	
	//konstraktor tabung dengan parameter jari2 dan tingii
	public Tabung(int jari2, int tinggi) {
		super(jari2);
		this.tinggi = tinggi;
	}
	
	//implementasi metho luas untuk menghitung luas permukaan tabung
	public double luas() {
		return 2*PHI*jari2*(jari2+tinggi);
		
	}
	
	//setter getter
	public int getTinggi() {
		return tinggi;
	}
	
	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

}

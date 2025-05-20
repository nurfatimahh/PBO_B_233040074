package Pertemuan11;

//kelas Lingkaran adalah turunan dari kelas bentuk
public class Lingkaran extends Bentuk {
	//Konstruktor Lingkaran yang memanggil konstruktor bentuk dengan parameter jari2
	public Lingkaran(int jari2) {
		super(jari2);
	}
	
	//implemetasi method luas untuk menghitung luas lingkaran
	public double luas() {
		return PHI*jari2*jari2;
	}

}


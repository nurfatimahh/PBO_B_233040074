package Pertemuan5;

public class MataKuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	//konstruktor
	public MataKuliah(String kode, String nama, String index, int sks) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.setSks(sks);
	}
	public String display() {
		return kode + " - " + nama + " - " + index + " - " + getSks() + "SKS";
	}
	public double nilaiIndex () {
		switch (index.toUpperCase()) {
		case"A" :
			return 4.0;
		case"AB" :
			return 3.5;
		case"B" :
			return 3.0;
		case"BC" :
			return 2.5;
		case"D" :
			return 2.0;
		case"E" :
			return 1.0;
		default:
			return -1; 
			
		}
		
	}
	public int getSks() {
		return sks;
	}
	public void setSks(int sks) {
		this.sks = sks;
	}
}

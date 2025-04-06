package Pertemuan7;
public class MataKuliah {
	private String kode;
	private String nama;
	private int sks;
	private String nilai;
	private Dosen dosen;
	
	/* konstruktor*/
	public MataKuliah(String kode, String nama, String nilai, int sks, Dosen dosen) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
		this.nilai = nilai;
		this.dosen = dosen;
	}
	public double getNilai () {
		switch (nilai.toUpperCase()) {
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
	public String display() {	
		return kode + "- " + nama + "(" + sks + " SKS) |  Nilai : "  + nilai +"  | Dosen: " + dosen.getNama() + " (NIDN: " + dosen.getNidn() + ")";
	}
}






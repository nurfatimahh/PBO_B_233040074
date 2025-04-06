package Pertemuan7;

public class Mahasiswa {
	private String NRP;
	private String Nama;
	
	public Mahasiswa() {
		
	}
	
	public Mahasiswa(String nrp, String nama) {
		super();
		this.NRP = nrp;
		this.Nama = nama;
	}
	public String display() {
		return "NRP:"+ NRP+ ". Nama:"+Nama;
	}
	public String getNrp() {
		return NRP;
	}
	public void setNrp(String nrp) {
		this.NRP = nrp;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String nama) {
		this.Nama = nama;
	}
}


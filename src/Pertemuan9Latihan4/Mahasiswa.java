package Pertemuan9Latihan4;

public class Mahasiswa extends Orang {
	private String nrp;
	
	public Mahasiswa(String nrp, String nama, String alamat) {
		super(nama, alamat);
		setNrp(nrp);
	}
	public String getNrp() {
		return nrp;
	}
	private void setNrp(String nrp) {
		this.nrp = nrp;
	}
}


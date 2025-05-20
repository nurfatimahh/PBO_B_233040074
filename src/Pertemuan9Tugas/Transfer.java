package Pertemuan9Tugas;

public class Transfer extends Pembayaran {
	private String noRekeningTujuan;
	
	public Transfer(double jumlah, String tanggal, String noRekeningTujuan) {
		super(jumlah, tanggal);
		setNoRekeningTujuan(noRekeningTujuan);
	}
	
	public String getNoRekeningTujuan() {
		return noRekeningTujuan;
	}
	public void setNoRekeningTujuan(String noRekeningTujuan) {
		this.noRekeningTujuan = noRekeningTujuan;
	}
}


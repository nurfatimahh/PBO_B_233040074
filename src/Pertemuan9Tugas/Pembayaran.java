package Pertemuan9Tugas;

public class Pembayaran {
	protected  double jumlah;
	protected  String tanggal;
	
	public Pembayaran(double jumlah, String tanggal) {
		this.jumlah = jumlah;
		this.tanggal = tanggal;		
	}
	
	public double getJumlah() {
		return jumlah;
	}
	
	public String getTanggal() {
		return tanggal;
	}
 }


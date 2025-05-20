package Pertemuan11;

//implemetasi kartu mendefinisikan dua method yang harus diimplementasikan oleh kelas yang mengimplementasikannya 
public abstract class Kartu {
	//Method otentikasi PIN
	public abstract boolean otentikasi(String pin);
	
	//Method untuk mengkripsi PIN 
	public abstract String encode(String pin);
}


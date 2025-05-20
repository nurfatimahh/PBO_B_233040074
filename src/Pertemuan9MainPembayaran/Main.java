package Pertemuan9MainPembayaran;

import Pertemuan9Tugas.Transfer;

public class Main {
	public static void main(String[] args) {
		 Transfer transfer = new Transfer(100000, "2025-05-30", "123456789");
		 System.out.println("Transfer: Rp" + transfer.getJumlah() +
		 					" | Tanggal: " + transfer.getTanggal() +
		 					" | No Rekening: " + transfer.getNoRekeningTujuan());
	}
}


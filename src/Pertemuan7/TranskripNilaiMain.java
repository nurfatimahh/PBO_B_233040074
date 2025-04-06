package Pertemuan7;

public class TranskripNilaiMain {
	public static void main(String[] args) {
		
		//Create objek DOsen 
		Dosen dosen1 = new Dosen("1", "Fajar Darmawan.ST.MT");
		Dosen dosen2 = new Dosen("3", "Erik.ST.,M.Kom");
		Dosen dosen3 = new Dosen("7", "Anggoro.ST.,M.Kom");
		
		//Create objek matakuliah 
		MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1", "AB",3, dosen1);
		MataKuliah mk2 = new MataKuliah("002", "Sistem Manajemen BasisData", "A",3, dosen2);
		MataKuliah mk3 = new MataKuliah("003", "Visualisasi Data", "A",3, dosen3);
		
		//Create objek KHS
		KartuHasilStudi khs = new KartuHasilStudi ("Ganjil");
		khs.addMataKuliah(mk1);
		khs.addMataKuliah(mk2);
		khs.addMataKuliah(mk3);
		khs.hitungIPS();
		
		//Create Objek Mahasiswa
		Mahasiswa mhs = new Mahasiswa("233040074", "Nurfatimah");
		
		//Create Objek TranskipNilai
		TranskripNilai transkrip = new TranskripNilai (mhs);
		transkrip.addKHS(khs);
		transkrip.hitungIPK();
		transkrip.display();
	}
}



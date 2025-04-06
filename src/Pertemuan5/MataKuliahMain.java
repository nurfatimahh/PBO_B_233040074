package Pertemuan5;

public class MataKuliahMain {
	public static void main(String[]args) {
		MataKuliah mk1 = new MataKuliah("001", "Alpro A","A", 3);
		MataKuliah mk2 = new MataKuliah("002", "matif A", "A", 3);
		MataKuliah mk3 = new MataKuliah("003", "asi A", "A", 3);

		System.out.println("-- DAFTAR MATA KULIAH--");
		System.out.println(mk1.display());
		System.out.println(mk2.display());
		System.out.println(mk3.display());
		
		System.out.println("---NILAI IPK---");
		double totalBobot = (mk1.nilaiIndex() * mk1.getSks()) +
		 					(mk2.nilaiIndex() * mk2.getSks()) +
		 					(mk3.nilaiIndex() * mk3.getSks()) ;
		
		int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
		double ipk = totalBobot / totalSks;
		System.out.println(ipk);

	}
}
 
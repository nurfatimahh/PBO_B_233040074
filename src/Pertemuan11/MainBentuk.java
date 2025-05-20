package Pertemuan11;

public class MainBentuk {
	public static void main(String []args) {
		Lingkaran L = new Lingkaran(10);
		
		System.out.println("== Lingkaran ==");
		System.out.println("jari2: " + L.getJari2());
		System.out.println("luas:" + L.luas());
		
		Tabung t = new Tabung();
		t.setJari2(10);
		t.setTinggi(5);
		System.out.println("==Tabung");
		System.out.println("jari2:" + t.getJari2());
		System.out.println("tinggi:" + t.getTinggi());
		System.out.println("luas:" + t.luas());


	}
}
 
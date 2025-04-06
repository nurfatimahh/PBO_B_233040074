package Pertemuan5;

public class GelasMain {
	public static void main(String[] args) {
	Gelas g1 = new Gelas("Hitam");
	Gelas g2 = new Gelas("Biru");
	
	tukarWarnaGelas(g1,g2);
	System.out.println("Warna g1 setelah ditukar:"+ g1.getwarna());
	System.out.println("Warna g2 setelah ditukar:"+ g2.getwarna());

	}
	static void tukarWarnaGelas(Gelas g1, Gelas g2) {
		Gelas gTemp = new Gelas("Temp");
		gTemp.setwarna(g1.getwarna());
		g1.setwarna(g2.getwarna());
		g2.setwarna(gTemp.getwarna());
	}

}
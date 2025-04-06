package Pertemuan4;

public class MainLingkaran4 {
	public static void main(String[] args) {
		Lingkaran L1 = new Lingkaran(5);
		Lingkaran L2 = L1;
		Lingkaran L3 = new Lingkaran(7);
		
		System.out.println("Jari-jari L1 : " + L1.getjarijari());
		System.out.println("Jari-jari L2 : " + L2.getjarijari());
		System.out.println("Jari-jari L3 : " + L3.getjarijari());
		
		L1 = null;
		L2 = null;
		L3 = null;
	}
}


package Pertemuan4;

public class MainLingkaran5 {
	public static void main(String[] args) {
		Lingkaran L1 = new Lingkaran(5);
		Lingkaran L2 = L1;
		
		System.out.println("Jari-jari L1 : " + L1.getjarijari());
		System.out.println("Jari-jari L2 : " + L2.getjarijari());
		
		ubahjarijari(L2);
			
		System.out.println("Jari-jari L1 : " + L1.getjarijari());
		System.out.println("Jari-jari L2 : " + L2.getjarijari());
		}
	public static void ubahjarijari(Lingkaran obj) {
		obj.setjarijari(4);
	}
}




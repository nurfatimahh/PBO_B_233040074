package Pertemuan4;

public class MainLingkaran {
	
	public static void main(String[] args) {
		Lingkaran L1 = new Lingkaran(5);
		Lingkaran L2 = L1;
			
		System.out.println("Jari-jari L1 : " + L1.getjarijari());
		System.out.println("Jari-jari L2 : " + L2.getjarijari());
			
		L2.setjarijari(10);
			
		System.out.println("Jari-jari L1 : " + L1.getjarijari());
		System.out.println("Jari-jari L2 : " + L2.getjarijari());
			
		}
}

 
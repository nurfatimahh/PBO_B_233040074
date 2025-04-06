package Pertemuan4;

public class MainLingkaran2 {
	public static void main(String[] args) {
		Lingkaran L1 = new Lingkaran(5);
		Lingkaran L2 = L1;
		Lingkaran L3 = new Lingkaran(7);
		
		System.out.println("Jari-jari L1 : " + L1.getjarijari());
		System.out.println("Jari-jari L2 : " + L2.getjarijari());
		System.out.println("Jari-jari L3 : " + L3.getjarijari());
		
		L2 = null;
			
		System.out.println("Jari-jari L1 setelah perubahan: " + L1.getjarijari());
		System.out.println("Jari-jari L2 setelah perubahan: " + L2.getjarijari());
		System.out.println("Jari-jari L3 setelah perubahan: " + L3.getjarijari());
		}

}


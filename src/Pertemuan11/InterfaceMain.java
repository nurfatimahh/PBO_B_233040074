package Pertemuan11;

public class InterfaceMain {
	public static void main(String[] args) {
		// Untuk membuat KartuElektronik dengan kode bank "IF111" dab PIN "123"
		KartuElektronik kartu = new KartuElektronik("IF111", "123");
		
		//Memanggil method otentikasi dengan input PIN"123"
		System.out.println("Otentikasi: " + kartu.otentikasi("123"));
	}
}

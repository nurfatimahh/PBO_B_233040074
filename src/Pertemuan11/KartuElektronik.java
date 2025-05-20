package Pertemuan11;

//Kelas ini dinamakan kelas KartuElektronik, yang merepresentasikan sebuah kartu elektronik
public class KartuElektronik {
	//atributnya kodeBandk dan pin
	private String kodeBank;
	private String pin;
	
	public KartuElektronik(String kodeBank, String pin) {
		//konstruktor Kartu Elektronik
		super();
		this.kodeBank = kodeBank;
		this.pin = pin;
	}
	//Metode Otentikasi 
	public boolean otentikasi(String pinInput) {
		if (pin.equals(pinInput))
			return true;
		else
			return false;
	}
	//Metode encode
	public String encode(String pin) {
		//melakukan enkripsi inout PIN
		return null;
	}
}




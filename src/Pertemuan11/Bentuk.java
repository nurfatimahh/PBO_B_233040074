package Pertemuan11;

public abstract class Bentuk {
	//atribut phi dan jari2
	protected double PHI = 3.14;
	protected int jari2;
	
	//Konstraktor untuk mengunisialisai jari2
	public Bentuk(int jari2) {
		super();
		this.jari2 = jari2;
	}
	
	//Method abstrak luas yang harus diimplementasikan oleh subclass
	public abstract double luas();
	
	//Setter Getter
	public int getJari2() {
		return jari2;
	}
	public void setJari2(int jari2) {
		this.jari2 = jari2;
	}
}


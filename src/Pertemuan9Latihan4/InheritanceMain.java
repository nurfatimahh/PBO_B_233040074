package Pertemuan9Latihan4;

public class InheritanceMain {
	 public static void main(String[] args) {
		 Mahasiswa mhs = new Mahasiswa("233040074","Nurfatiamh", "Bandung");
		 System.out.println(mhs.getNrp()+ 
				 		"_"+ mhs.getNama()+
				 		"_"+ mhs.getAlamat());
	 }
}

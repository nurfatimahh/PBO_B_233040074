package Pertemuan4;

public class MainStudent {
	public static void main(String [] args) {
		Student x = new Student ();
		Student y = x;
		
		x.setnrp("01");
		y.setnrp("02");
		
		System.out.println(x.getnrp());
		
		Student z = new Student();
		
		z.setnrp("03");
		
		x = z;
		
		System.out.println(x.getnrp());
		System.out.println(y.getnrp());
		
	}
}


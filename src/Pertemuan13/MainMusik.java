package Pertemuan13;

public class MainMusik {
    public static void main(String[] args) {
        // Polymorphism: objek bertipe induk, instance dari anak
        AlatMusik alat1 = new Gitar();
        AlatMusik alat2 = new Piano();
        AlatMusik alat3 = new Drum();
        
        // Memanggil metode yang sesuai kelas anak
        alat1.mainkan();
        alat2.mainkan(); 
        alat3.mainkan();
    }
}


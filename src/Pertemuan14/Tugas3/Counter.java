package Pertemuan14.Tugas3;

public class Counter {
//Variabel static untuk melacak jumlah instansi
        private static int instanceCount;

     public Counter() {
        instanceCount++;
    }
     // Method static untuk mengembalikan jumlah instansi
    public static int getInstanceCount() {
        return instanceCount;
    }
}

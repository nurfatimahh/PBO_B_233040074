package Pertemuan14.Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        // Membuat beberapa objek Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        System.out.println("Total objek Counter yang telah dibuat: " + Counter.getInstanceCount());
    }
}
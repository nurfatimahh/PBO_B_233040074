package Pertemuan14.Tugas2;

//kelas ini merupakan subclass dari BankAccount
public class SavingsAccount extends BankAccount {
    //konstruktor
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(double amount){
         super.deposit(amount); // tambahkan saldo seperti biasa
        System.out.println("Saldo berhasil ditambah di tabungan: $" + amount);
    }

    // ini adalah kode yang menyebabkan error karena terdapat final pada method displayAccountInfo()
    // public void displayAccountInfo(){
    //     System.out.println("tes");
    // }


    //membuat method baru di subclass tanpa mengubah method final
     public void displayExtendedInfo() {
        super.displayAccountInfo();
        System.out.println("tes");
    }
}
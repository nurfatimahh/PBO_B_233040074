package Pertemuan14.Tugas2;

public class BankAccount {
    // Variabel final accountNumber yang diinisialisasi melalui constructor
    private final String accountNumber;
    private double balance;

    //konstruktor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method untuk menambah saldo
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method final untuk menampilkan informasi 
    public final void displayAccountInfo() {
        System.out.println("AccountNumber:" + accountNumber);
        System.out.println("Saldo: " + balance);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class BankAccount {
    // Variabel privat untuk menerapkan enkapsulasi
    private String accountNumber;
    private double balance;

    // Konstruktor dengan validasi saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter untuk nomor akun
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter untuk membaca saldo saat ini
    public double getBalance() {
        return balance;
    }

    // Metode mutator untuk setoran uang
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; // Tambahkan saldo
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Metode mutator untuk penarikan uang
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        } else {
            this.balance -= amount; // Kurangi saldo
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    // Method main untuk simulasi transaksi bank
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", 500000);

        acc.deposit(-50000);      // Ditolak: nilai negatif
        acc.withdraw(700000);     // Ditolak: saldo kurang
        acc.withdraw(200000);     // Berhasil

        System.out.println("Saldo akhir akun " + acc.getAccountNumber() + ": Rp" + acc.getBalance());
    }
}

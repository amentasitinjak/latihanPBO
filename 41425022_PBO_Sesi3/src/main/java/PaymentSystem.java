/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// Interface untuk menstandarkan metode pembayaran
interface PaymentMethod {
    double TRANSACTION_FEE = 2500.0; // Konstanta biaya admin
    void pay(double amount);
    String getPaymentDetails();
}

// Implementasi E-Wallet
class EWalletPayment implements PaymentMethod {
    private String phoneNumber;

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount +
                           " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}

// Implementasi Kartu Kredit
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar Rp" + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}

// Kelas utama pengujian
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");

        payment1.pay(50000);
        payment2.pay(150000);
    }
}

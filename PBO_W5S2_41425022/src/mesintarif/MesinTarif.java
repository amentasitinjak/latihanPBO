/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesintarif;

/**
 *
 * @author ASUS
 */
// Kelas untuk menghitung tarif pengiriman dengan konsep Method Overloading
public class MesinTarif {
    private String kotaAsal;

    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Overloading 1: Menghitung ongkir berdasarkan berat dasar
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Overloading 2: Menghitung ongkir + biaya asuransi
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.001;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Overloading 3: Menghitung ongkir + layanan express
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000;
        }
        return total;
    }

    /* ========================================================================
     *                    JAWABAN LEMBAR ANALISIS OVERLOADING
     * ========================================================================
     * Pertanyaan 1:
     * Mengapa compiler Java dapat menentukan method hitungOngkir mana yang 
     * dijalankan sebelum program dieksekusi (compile-time)? Bagian method apa 
     * yang diperiksa compiler?
     * 
     * Jawab:
     * Compiler memeriksanya saat kompilasi berdasarkan "Method Signature", 
     * yaitu kombinasi dari:
     * 1. Nama method
     * 2. Jumlah parameter
     * 3. Tipe data parameter
     * Compiler mencocokkan argumen yang dikirim saat pemanggilan dengan daftar 
     * parameter yang tersedia pada kelas tersebut.
     * ------------------------------------------------------------------------
     * Pertanyaan 2:
     * Jika ditambahkan method: public int hitungOngkir(double beratKg), mengapa 
     * compiler menolak kode tersebut padahal tipe kembaliannya berbeda?
     * 
     * Jawab:
     * Karena Java TIDAK mengizinkan dua method dalam satu kelas memiliki nama 
     * dan parameter yang persis sama, meskipun tipe kembaliannya (return type) 
     * berbeda. Perbedaan return type saja tidak cukup untuk membedakan method 
     * saat dipanggil.
     * ========================================================================
     */
}

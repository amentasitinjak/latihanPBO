/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI KELAS ABSTRAK ===");

        // PERCOBAAN 1 (Akan error jika di-uncomment):
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        TrukBox fuso = new TrukBox("B 9999 X", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("Ikan Segar");

        System.out.println("----------------------------------");

        MobilVan granmax = new MobilVan("B 8888 Y", 800);
        granmax.infoKendaraan();
        granmax.angkutBarang("Paket Sembako");
    }

    /* ========================================================================
     *                    JAWABAN LEMBAR ANALISIS ABSTRAKSI
     * ========================================================================
     * Eksperimen 1:
     * Pesan error saat instansiasi kelas abstrak (new KendaraanEkspedisi):
     *   "error: KendaraanEkspedisi is abstract; cannot be instantiated"
     * 
     * Alasan menggagalkan:
     * Kelas abstrak bertindak sebagai cetak biru (blueprint) / SOP kerangka dasar 
     * yang belum lengkap. Objeknya belum memiliki bentuk fisik yang nyata di dunia 
     * nyata, sehingga Java melarang penginstansiasian langsung menggunakan kata kunci 'new'.
     * ------------------------------------------------------------------------
     * Eksperimen 2:
     * Dua opsi perbaikan dari IDE ketika membuat class MotorKurir extends 
     * KendaraanEkspedisi tanpa menuliskan method angkutBarang():
     * 
     * 1. Implement all abstract methods:
     *    IDE akan membuatkan template method @Override public void angkutBarang(...) 
     *    di dalam class MotorKurir.
     * 2. Make 'MotorKurir' abstract:
     *    Mengubah deklarasi kelas menjadi 'abstract class MotorKurir', sehingga 
     *    kewajiban mengimplementasikan method abstrak diturunkan ke kelas turunan berikutnya.
     * ========================================================================
     */
}

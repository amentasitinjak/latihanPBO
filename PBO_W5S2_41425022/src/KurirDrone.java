/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// Child Class dari KurirReguler
public class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Kurir Drone [" + idDrone + "] mengantar barang ke " + alamat + " lewat jalur udara.");
    }

    /* ========================================================================
     *                    JAWABAN LEMBAR ANALISIS OVERRIDING
     * ========================================================================
     * Pertanyaan 1 & 2 (Eksperimen typo nama method & hapus @Override):
     * Jika nama method diubah menjadi kirimbarang (huruf 'b' kecil):
     * - Output dari k2.kirimBarang("Gedung Graha Lt. 5") berubah menjadi:
     *   "Kurir Reguler [Siti] mengantar barang ke Gedung Graha Lt. 5 lewat jalur darat."
     * - Hal ini terjadi karena Java menganggap kirimbarang() sebagai method baru, 
     *   sehingga yang dipanggil adalah method kirimBarang() milik parent class.
     * 
     * Jika tulisan @Override dikembalikan di atas method yang salah ketik (kirimbarang), 
     * pesan error dari compiler:
     *   "error: method does not override or implement a method from a supertype"
     * ------------------------------------------------------------------------
     * Pertanyaan 3:
     * Jelaskan fungsi utama dari tulisan @Override bagi seorang programmer!
     * 
     * Jawab:
     * Anotasi @Override berfungsi sebagai bentuk validasi dan proteksi bagi 
     * programmer agar compiler memastikan bahwa method tersebut benar-benar 
     * melakukan overriding dari parent class. Jika terjadi kesalahan ketik 
     * (typo) atau perbedaan parameter, compiler akan langsung memberikan error.
     * ========================================================================
     */
}

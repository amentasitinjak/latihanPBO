/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
/*
Nama: Amenta Rebekka Wirawati Sitinjak
NIM: 41425022
Prodi: DIV TRPL
*/
import java.util.*;

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Penambahan kelas RonWeasley sesuai Instruksi 2
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan tongkat yang pernah patah dan ragu-ragu.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley(); // Polimorfisme untuk Ron Weasley

        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}

/* ========================================================================
 *                    JAWABAN ANALYSIS BAGIAN 1.2
 * ========================================================================
 * Pertanyaan 1:
 * Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih berjalan?
 * Jawab:
 * Kode tetap berjalan lancar jika nama dan parameter method-nya benar-benar sama dengan di parent class.
 * Namun, tanpa @Override, jika kita salah mengetik nama method (misal: ucapkanmantra), Java akan 
 * menganggapnya sebagai method baru di child class dan overriding gagal tanpa ada peringatan dari compiler.
 * 
 * Pertanyaan 2:
 * Apa keuntungan menggunakan polymorphism dalam contoh ini?
 * Jawab:
 * Keuntungannya adalah keluwesan (flexibility) dan maintainability. Kita dapat memperlakukan semua objek 
 * turunan (HarryPotter, Hermione, RonWeasley) sebagai tipe induknya (Penyihir). Saat memanggil method 
 * ucapkanMantra(), Java secara otomatis mengeksekusi perilaku yang sesuai dengan objek aslinya di runtime (Dynamic Binding).
 * ========================================================================
 */

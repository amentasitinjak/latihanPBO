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

public class Mantra {
    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload: method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload: method ucapkan() dengan tiga parameter (Sesuai Instruksi 2)
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Overload tambahan sesuai eksperimen pertanyaan: urutan parameter berbeda
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan mantra dengan kekuatan " + kekuatan + " bernama: " + namaMantra);
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
        
        // Memanggil method overloading dengan urutan parameter berbeda
        mantra.ucapkan(20, "Stupefy");
    }
}

/* ========================================================================
 *                    JAWABAN ANALYSIS BAGIAN 1.1
 * ========================================================================
 * Pertanyaan 1:
 * Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method dengan dua parameter.
 * Jawab:
 * Jika method dengan dua parameter dihapus, lalu kita memanggil mantra.ucapkan("Expelliarmus", 5),
 * compiler Java akan memberikan pesan error (compile-time error) karena tidak menemukan 
 * signature method yang sesuai dengan argumen (String, int).
 * 
 * Pertanyaan 2:
 * Bisakah kita membuat method overloading dengan urutan parameter yang berbeda?
 * Jawab:
 * Bisa. Java membedakan method overloading berdasarkan method signature (nama method, jumlah, 
 * tipe data, dan urutan parameter). Method ucapkan(int kekuatan, String namaMantra) sah 
 * dan dapat dieksekusi dengan baik.
 * ========================================================================
 */
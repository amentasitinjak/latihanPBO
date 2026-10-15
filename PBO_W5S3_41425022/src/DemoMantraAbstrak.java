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

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();

    public void ucapkan() {
        // Method konkret
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Penambahan kelas Lumos sesuai Instruksi 2
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat sihir.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        mantra1.ucapkan();
        mantra1.efek();
        
        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();
    }
}

/* ========================================================================
 *                    JAWABAN ANALYSIS BAGIAN 2.1
 * ========================================================================
 * Pertanyaan 1:
 * Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung? Coba dan jelaskan errornya.
 * Jawab:
 * Terjadi compile-time error dengan pesan: "MantraAbstrak is abstract; cannot be instantiated".
 * Ini terjadi karena Abstract Class bertindak sebagai blueprint/kerangka yang belum lengkap (memiliki method abstrak tanpa body),
 * sehingga Java melarang penginstansiasian langsung dengan kata kunci 'new'.
 * 
 * Pertanyaan 2:
 * Mengapa kita perlu membuat abstract class? Apa keuntungannya?
 * Jawab:
 * Abstract class digunakan untuk mendefinisikan standar/SOP dan merancang kontrak dasar bagi kelas-kelas turunannya.
 * Keuntungannya:
 * 1. Menghindari duplikasi kode dengan menyediakan atribut/method umum yang reusable.
 * 2. Memaksa subclass untuk mewajibkan implementasi method abstrak tertentu (misal: method efek()).
 * ========================================================================
 */

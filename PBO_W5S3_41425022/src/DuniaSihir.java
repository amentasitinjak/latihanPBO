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
import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equalsIgnoreCase(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Modifikasi Instruksi 2: Memanggil semua mantra yang dipelajari dalam satu perintah
    public void ucapkanSemuaMantra() {
        System.out.println("\n--- " + nama + " Mengucapkan Semua Mantra yang Dipelajari ---");
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apa pun.");
            return;
        }
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
        System.out.println("------------------------------------------------------------\n");
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // Memanggil fitur baru: mengucapkan semua mantra
        harry.ucapkanSemuaMantra();
    }
}

/* ========================================================================
 *                    JAWABAN ANALYSIS BAGIAN 3.1
 * ========================================================================
 * Pertanyaan 1:
 * Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
 * Jawab:
 * Abstract Class 'Mantra' bertindak sebagai tipe data umum dalam List<Mantra>. 
 * Polimorfisme memungkinkan List<Mantra> menampung berbagai objek konkrit (Expelliarmus, Lumos, dll).
 * Saat dipanggil mantra.efek(), Java secara otomatis mengeksekusi method @Override milik masing-masing kelas turunan.
 * 
 * Pertanyaan 2:
 * Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah kelas Penyihir? Apakah mudah? Mengapa?
 * Jawab:
 * Sangat mudah. Kelas Penyihir berinteraksi dengan tipe abstrak 'Mantra' (Loose Coupling), bukan dengan kelas spesifik.
 * Kita cukup membuat kelas baru yang mewarisi Mantra (misal: class AvadaKedavra extends Mantra) tanpa perlu 
 * mengubah/mengedit baris kode di dalam kelas Penyihir sama sekali (memenuhi prinsip Open/Closed Principle).
 * ========================================================================
 */

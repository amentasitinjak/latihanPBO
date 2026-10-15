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

// 1. Abstract class MantraPerlindungan
abstract class MantraPerlindungan {
    private String namaMantra;

    public MantraPerlindungan(String namaMantra) {
        this.namaMantra = namaMantra;
    }

    public String getNamaMantra() {
        return namaMantra;
    }

    // Method abstrak yang wajib diimplementasikan oleh subclass
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// 2. Kelas Konkret: Protego
class Protego extends MantraPerlindungan {
    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("[AKTIF] Perisai Protego terbentuk! Menahan serangan mantra langsung.");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("[NONAKTIF] Perisai Protego meredup dan menghilang.");
    }
}

// Kelas Konkret: Fidelius
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("[AKTIF] Mantra Fidelius diaktifkan. Lokasi disembunyikan dalam jiwa Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("[NONAKTIF] Mantra Fidelius dicabut. Rahasia lokasi dapat diakses.");
    }
}

// Kelas Konkret: MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        super("Mantra Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("[AKTIF] " + getNamaMantra() + " aktif di area " + area + ". Penyihir tidak bisa melakukan Apparition!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("[NONAKTIF] " + getNamaMantra() + " dinonaktifkan di area " + area + ".");
    }
}

// 3. Kelas SistemPertahanan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        this.daftarMantra = new ArrayList<>();
    }

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra perlindungan '" + mantra.getNamaMantra() + "' berhasil ditambahkan ke sistem.");
    }

    public void aktifkanSemuaMantra() {
        System.out.println("\n=== MENGAKTIFKAN SELURUH SISTEM PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan m : daftarMantra) {
            m.aktifkan();
        }
        System.out.println("=======================================================\n");
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== MENONAKTIFKAN SELURUH SISTEM PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan m : daftarMantra) {
            m.nonaktifkan();
        }
        System.out.println("========================================================\n");
    }
}

// 4. Kelas Main untuk demonstrasi
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwartsShield = new SistemPertahanan();

        // Membuat objek mantra perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Kawasan Seluruh Kastil Hogwarts");

        // Menambahkan mantra ke sistem
        hogwartsShield.tambahMantra(protego);
        hogwartsShield.tambahMantra(fidelius);
        hogwartsShield.tambahMantra(antiApparition);

        // Mengaktifkan seluruh mantra perlindungan
        hogwartsShield.aktifkanSemuaMantra();

        // Menonaktifkan seluruh mantra perlindungan
        hogwartsShield.nonaktifkanSemuaMantra();
    }
}

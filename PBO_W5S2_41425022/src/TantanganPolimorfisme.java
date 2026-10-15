/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// Parent class abstrak untuk Armada
abstract class ArmadaEkspedisi {
    protected String noPolisi;

    public ArmadaEkspedisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public abstract void angkutBarang();
}

class TrukPengangkut extends ArmadaEkspedisi {
    public TrukPengangkut(String noPolisi) {
        super(noPolisi);
    }

    @Override
    public void angkutBarang() {
        System.out.println("Truk [" + noPolisi + "] memuat kontainer muatan besar.");
    }
}

class MotorPengangkut extends ArmadaEkspedisi {
    public MotorPengangkut(String noPolisi) {
        super(noPolisi);
    }

    @Override
    public void angkutBarang() {
        System.out.println("Motor [" + noPolisi + "] membawa paket dokumen via tas kurir.");
    }
}

public class TantanganPolimorfisme {
    public static void main(String[] args) {
        /* ====================================================================
         * LOGIKA TANTANGAN EKSTRA:
         * Menggunakan array bertipe Parent Class (ArmadaEkspedisi) untuk menyimpan 
         * objek-objek dari Child Class yang berbeda, lalu memanggil angkutBarang() 
         * dalam 1 loop secara polimorfis.
         * ====================================================================
         */
        ArmadaEkspedisi[] armada = new ArmadaEkspedisi[3];
        armada[0] = new TrukPengangkut("B 9001 DEL");
        armada[1] = new MotorPengangkut("BK 1234 AB");
        armada[2] = new TrukPengangkut("B 7788 XYZ");

        System.out.println("=== SIMULASI ARRAY POLIMORFISME ===");
        for (ArmadaEkspedisi a : armada) {
            a.angkutBarang();
        }
    }
}

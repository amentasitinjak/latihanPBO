package mesintarif;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== SIMULASI METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg)            : Rp " + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (2.0 Kg, 5 Jt): Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Express (2.0 Kg, Express) : Rp " + tarif.hitungOngkir(2.0, true));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI METHOD OVERRIDING ===");
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Siti", "DRONE-01");

        k1.kirimBarang("Jl. Sisingamangaraja No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

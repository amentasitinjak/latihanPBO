/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// Parent Class untuk Kurir
public class KurirReguler {
    private String nama;

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    public void kirimBarang(String alamat) {
        System.out.println("Kurir Reguler [" + nama + "] mengantar barang ke " + alamat + " lewat jalur darat.");
    }
}

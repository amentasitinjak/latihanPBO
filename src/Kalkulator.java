/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Kalkulator implements Operasi {
    public int tambah(int a, int b) { return a + b; }

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println("Hasil Tambah (Interface): " + k.tambah(10, 20));
    }
}

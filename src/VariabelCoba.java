/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class VariabelCoba {
    int speed;
    String nama;
    static int jumlahMahasiswa;

    void hitung() {
        int count = 0; // local variable
    }

    void setNama (String nama) {
        this.nama = nama;
    }

    public static void main(String[] args) {
        int umur = 20;
        double gaji = 3500000.50;
        boolean lulus = true;
        String namaBudi = "Budi";
        
        System.out.println("Nama: " + namaBudi + ", Umur: " + umur);
        System.out.println("Gaji: " + gaji + ", Lulus: " + lulus);
    }
    
    
}

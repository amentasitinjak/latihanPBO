/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class StudentGrade {
    // Atribut privat (Enkapsulasi)
    private final String nim;  // Read-only
    private final String nama; // Read-only
    private double nilaiKuis;
    private double nilaiUts;
    private String gradeHuruf; // Read-only, terhitung otomatis

    // Konstruktor utama
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUts = 0.0;
        kalkulasiGradeHuruf(); // Hitung nilai awal
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    // Getter untuk properti Read-Only
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public double getNilaiKuis() { return nilaiKuis; }
    public double getNilaiUts() { return nilaiUts; }
    public String getGradeHuruf() { return gradeHuruf; }

    // Private method untuk menghitung grade secara otomatis saat data diubah
    private void kalkulasiGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85.0) this.gradeHuruf = "A";
        else if (nilaiAkhir >= 70.0) this.gradeHuruf = "B";
        else if (nilaiAkhir >= 60.0) this.gradeHuruf = "C";
        else if (nilaiAkhir >= 50.0) this.gradeHuruf = "D";
        else this.gradeHuruf = "E";
    }

    // Setter nilai kuis dengan validasi 0-100
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            kalkulasiGradeHuruf(); // Update status grade otomatis
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0-100)");
        }
    }

    // Setter nilai UTS dengan validasi 0-100
    public void setNilaiUts(double nilaiUts) {
        if (nilaiUts >= 0.0 && nilaiUts <= 100.0) {
            this.nilaiUts = nilaiUts;
            kalkulasiGradeHuruf(); // Update status grade otomatis
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUts);
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUts + " (Harus antara 0-100)");
        }
    }

    // Hitung Nilai Akhir (40% Kuis + 60% UTS)
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUts);
    }

    // Cetak Kartu Hasil Studi
    public void cetakKHS() {
        System.out.println("\n=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUts);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Grade      : " + gradeHuruf);
    }

    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("11425001", "Marsha");
        student.setNilaiKuis(110.0); // Uji coba nilai salah
        student.setNilaiKuis(85.0);  // Uji coba nilai benar
        student.setNilaiUts(90.0);   // Uji coba nilai benar
        student.cetakKHS();
    }
}

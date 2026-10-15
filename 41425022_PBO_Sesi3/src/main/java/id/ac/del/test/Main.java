/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author ASUS
 */
import id.ac.del.rental.Car;
import id.ac.del.rental.Motorcycle;
import id.ac.del.rental.ParkingSystem;

public class Main {
    public static void main(String[] args) {
        ParkingSystem system = new ParkingSystem();

        Car car1 = new Car("B 1234 CD", "Budi");
        Motorcycle moto1 = new Motorcycle("BK 5678 EF", "Siti");

        System.out.println("=== SIMULASI MASUK PARKIR ===");
        system.parkVehicle(car1);
        system.parkVehicle(moto1);

        System.out.println("\n=== SIMULASI GPS TRACKING ===");
        car1.updateLocation(-6.2088, 106.8456);
        system.trackVehicleLocation(car1);
        system.trackVehicleLocation(moto1);

        System.out.println("\n=== SIMULASI PEMBAYARAN PARKIR ===");
        system.processParkingFee(car1, 3);
        system.processParkingFee(moto1, 3);
    }
}

/* ============================================================================
 *                    BAGIAN C: JAWABAN PERTANYAAN REFLEKSI
 * ============================================================================
 * 
 * Pertanyaan 1:
 * Mengapa atribut `plateNumber` dan `ownerName` pada kelas `Vehicle` harus 
 * dikemas dengan visibilitas `private` dan diakses melalui getter? Apa dampak 
 * jika visibilitasnya diubah menjadi `public`?
 * 
 * Jawab:
 * Atribut dikemas dengan visibilitas `private` untuk menerapkan prinsip 
 * Encapsulation (Enkapsulasi) dan Immutability (Read-Only). 
 * - Alasan: Plat nomor dan nama pemilik merupakan identitas utama kendaraan 
 *   yang tidak boleh diubah secara sembarangan di tengah jalan setelah objek dibuat.
 * - Dampak jika `public`: Pihak luar/kelas lain bisa langsung mengubah nilai 
 *   `plateNumber` dan `ownerName` tanpa melewati validasi, sehingga merusak 
 *   integritas data dan menyebabkan kerentanan keamanan pada sistem.
 * ----------------------------------------------------------------------------
 * 
 * Pertanyaan 2:
 * Jelaskan perbedaan peran antara kelas abstrak `Vehicle` dan interface 
 * `Chargeable` serta `Trackable` dalam desain sistem ini.
 * 
 * Jawab:
 * - `Vehicle` (Abstract Class): Mendefinisikan identitas umum ("APA DIA?") dari 
 *   sebuah objek, yaitu karakteristik dasar yang PASTI dimiliki oleh semua kendaraan 
 *   (seperti punya plat nomor dan pemilik).
 * - `Chargeable` & `Trackable` (Interface): Mendefinisikan kemampuan/perilaku 
 *   opsional ("APA YANG BISA DIA LAKUKAN?"). Interface ini digunakan untuk memisahkan 
 *   fitur opsional, karena tidak semua kendaraan punya kemampuan yang sama (semua 
 *   kendaraan di parkiran wajib bayar / Chargeable, tetapi hanya kendaraan tertentu 
 *   seperti Mobil yang memiliki fitur pelacak GPS / Trackable).
 * ----------------------------------------------------------------------------
 * 
 * Pertanyaan 3:
 * Mengapa kelas `Car` dapat mengimplementasikan dua interface sekaligus 
 * (`Chargeable` dan `Trackable`), sementara kelas `Motorcycle` hanya 
 * mengimplementasikan satu interface (`Chargeable`)? 
 * Prinsip Pemrograman Berorientasi Objek (PBO) apa yang ditunjukkan oleh hal ini?
 * 
 * Jawab:
 * - Alasan: Mobil dalam sistem ini dirancang memiliki dua kemampuan sekaligus, 
 *   yaitu dapat dikenakan tarif parkir dan dapat dilacak lokasinya via GPS. 
 *   Sedangkan Sepeda Motor hanya dirancang memiliki kemampuan tarif parkir tanpa GPS.
 * - Prinsip PBO yang ditunjukkan:
 *   1. Multiple Inheritance via Interfaces (Java mengizinkan satu kelas 
 *      mengimplementasikan banyak interface sekaligus).
 *   2. Interface Segregation Principle (ISP) / Separation of Concerns, di mana 
 *      kontrak kemampuan dipisah menjadi interface yang spesifik agar kelas turunan 
 *      tidak dipaksa mengimplementasikan method/fitur yang tidak dibutuhkannya.
 * ----------------------------------------------------------------------------
 * 
 * Pertanyaan 4:
 * Pada method `processParkingFee` di kelas `ParkingSystem`, bagaimana mekanisme 
 * `instanceof` dan type casting `(Chargeable)` bekerja untuk memastikan bahwa 
 * hanya kendaraan yang terhubung dengan interface `Chargeable` yang diproses?
 * 
 * Jawab:
 * - Mekanisme `instanceof`: Mengecek/memeriksa secara dinamis saat runtime apakah 
 *   objek `v` (yang tipe dasarnya adalah `Vehicle`) mengimplementasikan interface 
 *   `Chargeable` atau tidak. Hasilnya berupa nilai boolean (`true` / `false`).
 * - Mekanisme Type Casting `(Chargeable)`: Jika pengecekan `instanceof` bernilai `true`, 
 *   maka objek `v` dikonversi (downcasting) ke tipe `Chargeable` sehingga method 
 *   `calculateFee()` yang ada pada interface `Chargeable` dapat dipanggil secara aman 
 *   tanpa menyebabkan error runtime (`ClassCastException`).
 * ============================================================================
 */

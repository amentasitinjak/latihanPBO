/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class ParkingSystem {
    private final List<Vehicle> parkedVehicles = new ArrayList<>();

    public void parkVehicle(Vehicle v) {
        parkedVehicles.add(v);
        System.out.print("[SISTEM PARKIR] Kendaraan berhasil masuk: ");
        v.displayInfo();
    }

    public void processParkingFee(Vehicle v, int hours) {
        if (v instanceof Chargeable) {
            Chargeable c = (Chargeable) v;
            double fee = c.calculateFee(hours);
            System.out.println("-> Biaya Parkir (" + v.getPlateNumber() + ") selama " + hours + " jam: Rp " + fee);
        } else {
            System.out.println("-> Kendaraan ini tidak dikenakan biaya parkir.");
        }
    }

    public void trackVehicleLocation(Vehicle v) {
        if (v instanceof Trackable) {
            Trackable t = (Trackable) v;
            System.out.println("-> Lokasi GPS (" + v.getPlateNumber() + "): " + t.getLocation());
        } else {
            System.out.println("-> Kendaraan (" + v.getPlateNumber() + ") TIDAK mendukung fitur pelacakan GPS.");
        }
    }
}

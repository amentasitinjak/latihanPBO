/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */
public class Car extends Vehicle implements Chargeable, Trackable {
    private final double hourlyRate = 5000.0;
    private String currentLocation = "Belum terdeteksi";

    public Car(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    @Override
    public void displayInfo() {
        System.out.println("[MOBIL] Plat: " + getPlateNumber() + " | Pemilik: " + getOwnerName());
    }

    @Override
    public double calculateFee(int hours) {
        return hours * hourlyRate;
    }

    @Override
    public void updateLocation(double latitude, double longitude) {
        this.currentLocation = latitude + ", " + longitude;
    }

    @Override
    public String getLocation() {
        return currentLocation;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */
public class Motorcycle extends Vehicle implements Chargeable {
    private final double hourlyRate = 2000.0;

    public Motorcycle(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    @Override
    public void displayInfo() {
        System.out.println("[MOTOR] Plat: " + getPlateNumber() + " | Pemilik: " + getOwnerName());
    }

    @Override
    public double calculateFee(int hours) {
        return hours * hourlyRate;
    }
}

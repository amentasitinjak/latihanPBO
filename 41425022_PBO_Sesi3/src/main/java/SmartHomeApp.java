/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// Interface Sakelar
interface Switchable {
    void turnOn();
    void turnOff();
}

// Interface Jaringan Wireless
interface Connectable {
    void connectToWifi(String ssid, String ipAddress);
}

// Implementasi Lampu Pintar
class SmartLamp implements Switchable, Connectable {
    private boolean isOn = false; // State status nyala/mati
    private int brightness;

    public SmartLamp(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (isOn) {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
        } else {
            System.out.println("[Error] Lampu Pintar gagal konek WiFi! Perangkat masih mati.");
        }
    }
}

// Implementasi AC Pintar
class SmartAC implements Switchable, Connectable {
    private boolean isOn = false; // State status nyala/mati
    private int temperature;

    public SmartAC(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (isOn) {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
        } else {
            System.out.println("[Error] AC Pintar gagal konek WiFi! Perangkat masih mati.");
        }
    }
}

// Main Program
public class SmartHomeApp {
    public static void main(String[] args) {
        SmartLamp lamp = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        // Simulasi Lampu Pintar
        lamp.turnOn();
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        // Simulasi AC Pintar
        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
        ac.turnOff();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ControlStatements {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        int marks = 75;
        if (marks >= 85) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        int month = 8;
        String name;
        switch (month) {
            case 1: name = "January"; break;
            // ...
            case 8: name = "August"; break;
            default: name = "Invalid"; break;
        }
        System.out.println("Nama Bulan: " + name);

        int days;
        int year = 2024;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
            case 4: case 6: case 9: case 11: days = 30; break;
            case 2: days = isLeap(year) ? 29 : 28; break;
            default: days = 0; break;
        }
        System.out.println("Jumlah Hari: " + days);
    }

    static boolean isLeap(int year) { return false; }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class CastingCoba {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("Implicit Casting (int to double): " + myDouble);

        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2;
        System.out.println("Explicit Casting (double to int): " + myInt2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class OperatorCoba {
    public static void main(String[] args) {
        int sum = 3 + 4;
        int diff = 10 - 3;
        int prod = 7 * 3;
        double q = 20.0 / 3;
        int r = 7 % 3;
        System.out.println("Sum: " + sum + ", Diff: " + diff + ", Prod: " + prod + ", Div: " + q + ", Mod: " + r);

        int x = 10;
        x += 5;
        double p = Math.pow(2, 3);
        double s = Math.sqrt(64);
        System.out.println("x += 5: " + x + ", Pow: " + p + ", Sqrt: " + s);

        boolean r1 = (5 > 3) && (7 < 10);
        boolean r2 = (5 > 3) || (7 < 10);
        boolean r3 = !(5 > 3);
        System.out.println("Relational &&: " + r1);

        int and = 5 & 3;
        System.out.println("Bitwise AND: " + and);
    }
}

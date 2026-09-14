/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ArrayCoba {
    public static void main(String[] args) {
        int[] anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;
        System.out.println("anArray[0]: " + anArray[0]);

        int[] shortcutArray = {100, 200, 300, 400};
        System.out.println("Shortcut[0]: " + shortcutArray[0]);
        System.out.println("Shortcut[1]: " + shortcutArray[1]);

        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
    }
}
